/* Copyright (c) 2023, PGR2-Bot. Jericho Crosby <jericho.crosby227@gmail.com> */

package com.chalwk;

import com.chalwk.commands.RandomizeAll;
import com.chalwk.listeners.CommandManager;
import com.chalwk.listeners.EventListeners;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.util.ArrayList;

import static com.chalwk.util.Authentication.getToken;
import static com.chalwk.util.Cars.populateCars;
import static com.chalwk.util.Tracks.populateTracks;

public class Main {

    public static ArrayList<String> weather = new ArrayList<>() {{
        add("Sunny :sun_with_face:");
        add("Rain :cloud_rain:");
        add("Overcast :cloud:");
    }};
    public static ArrayList<String> timeOfDay = new ArrayList<>() {{
        add("Day :sunrise:");
        add("Night :night_with_stars:");
    }};
    private ShardManager shardManager;

    public Main() throws LoginException, IOException {
        shardManager = buildBot();
        populateCars();
        populateTracks();
    }

    public static void main(String[] args) {
        try {
            new Main();
        } catch (LoginException | IOException e) {
            System.out.println("Failed to start bot: " + e.getMessage());
        }
    }

    @NotNull
    private ShardManager buildBot() throws IOException {
        String token = getToken();
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.playing("PGR2"));
        builder.enableIntents(GatewayIntent.GUILD_MEMBERS,
                GatewayIntent.GUILD_MESSAGES,
                GatewayIntent.GUILD_PRESENCES,
                GatewayIntent.MESSAGE_CONTENT);

        shardManager = builder.build();
        shardManager.addEventListener(new EventListeners());

        CommandManager manager = new CommandManager();
        manager.add(new RandomizeAll());

        shardManager.addEventListener(manager);

        return shardManager;
    }
}
