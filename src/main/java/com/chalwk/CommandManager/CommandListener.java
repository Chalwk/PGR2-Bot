/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */
package com.chalwk.CommandManager;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A command listener that manages and executes {@link CommandInterface} commands.
 */
public class CommandListener extends ListenerAdapter {

    /**
     * A list of command objects implementing {@link CommandInterface}.
     */
    private final List<CommandInterface> commands = new ArrayList<>();

    /**
     * Registers all command objects in every Guild.
     *
     * @param event the {@link ReadyEvent} triggered when JDA is ready
     */
    @Override
    public void onReady(ReadyEvent event) {
        for (Guild guild : event.getJDA().getGuilds()) {
            for (CommandInterface command : commands) {
                guild.upsertCommand(command.getName(), command.getDescription()).addOptions(command.getOptions()).queue();
            }
        }
    }

    /**
     * Handles slash command interactions by executing the corresponding {@link CommandInterface}.
     *
     * @param event the {@link SlashCommandInteractionEvent} triggered when a slash command is used
     */
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        for (CommandInterface command : commands) {
            String cmd = event.getName();
            if (cmd.equals(command.getName())) {
                try {
                    command.execute(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return;
            }
        }
    }

    /**
     * Adds a command object to the list of managed commands.
     *
     * @param command the {@link CommandInterface} command to add
     */
    public void add(CommandInterface command) {
        commands.add(command);
    }
}