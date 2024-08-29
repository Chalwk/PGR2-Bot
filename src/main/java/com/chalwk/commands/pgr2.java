/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */
package com.chalwk.commands;

import com.chalwk.CommandManager.CommandCooldownManager;
import com.chalwk.CommandManager.CommandInterface;
import com.chalwk.util.RandomGenerator;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.util.ArrayList;
import java.util.List;

public class pgr2 implements CommandInterface {

    private static final CommandCooldownManager COOLDOWN_MANAGER = new CommandCooldownManager();

    @Override
    public String getName() {
        return "pgr2";
    }

    @Override
    public String getDescription() {
        return "Generate a random vehicle, vehicle class, track, time of day, and weather";
    }

    @Override
    public List<OptionData> getOptions() {

        List<OptionData> data = new ArrayList<>();
        OptionData options = new OptionData(OptionType.STRING, "options", "Generate a random vehicle, vehicle class, track, time of day, and weather")

                .setRequired(true)
                .addChoice("class", "class")
                .addChoice("vehicle", "vehicle")
                .addChoice("track", "track")
                .addChoice("time", "time")
                .addChoice("weather", "weather")
                .addChoice("all", "all");

        data.add(options);
        return data;
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {
        //if (COOLDOWN_MANAGER.isOnCooldown(event)) return;

        EmbedBuilder embed = new EmbedBuilder();
        RandomGenerator randomGenerator = new RandomGenerator();

        OptionMapping option = event.getOption("options");
        assert option != null;
        embed = switch (option.getAsString()) {
            case "class" -> randomGenerator.randomizeVehicleClass(embed);
            case "vehicle" -> randomGenerator.randomizeVehicle(embed);
            case "track" -> randomGenerator.randomizeTrack(embed);
            case "time" -> randomGenerator.randomizeTimeOfDay(embed);
            case "weather" -> randomGenerator.randomizeWeather(embed);
            case "all" -> randomGenerator.randomizeAll(embed);
            default -> embed;
        };

        embed.setColor(0x00FF00);
        event.replyEmbeds(embed.build()).queue();

        //COOLDOWN_MANAGER.setCooldown(getName(), event.getUser());
    }
}
