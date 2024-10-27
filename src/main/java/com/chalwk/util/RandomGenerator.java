/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */

package com.chalwk.util;

import com.chalwk.enums.CarCategory;
import com.chalwk.enums.City;
import com.chalwk.enums.TimeOfDay;
import com.chalwk.enums.Weather;
import net.dv8tion.jda.api.EmbedBuilder;

import java.util.List;
import java.util.Random;

/**
 * Utility class for generating random game elements in the PGR2 Discord Bot.
 */
public class RandomGenerator {
    private final Random random = new Random();

    /**
     * Adds a random vehicle class to the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance
     * @return the modified {@link EmbedBuilder} instance
     */
    public EmbedBuilder randomizeVehicleClass(EmbedBuilder embed) {
        CarCategory randomCategory = getRandomEnum(CarCategory.class);
        embed.setTitle("RANDOM CLASS 🎲")
                .setColor(0x1F8B4C) // Set a color for the embed
                .addField("**Vehicle Class:**", randomCategory.getName(), false);
        return embed;
    }

    /**
     * Adds a random vehicle to the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance
     * @return the modified {@link EmbedBuilder} instance
     */
    public EmbedBuilder randomizeVehicle(EmbedBuilder embed) {
        CarCategory randomCategory = getRandomEnum(CarCategory.class);
        String randomCar = getRandomElement(randomCategory.getCars());

        embed.setTitle("RANDOM VEHICLE 🚗")
                .setColor(0x1F8B4C)
                .addField("**Vehicle:**", randomCar, false);
        return embed;
    }

    /**
     * Adds a random track to the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance
     * @return the modified {@link EmbedBuilder} instance
     */
    public EmbedBuilder randomizeTrack(EmbedBuilder embed) {
        City randomCity = getRandomEnum(City.class);
        String randomTrack = getRandomElement(randomCity.getTracks());

        embed.setTitle("RANDOM TRACK 🛣️")
                .setColor(0x1F8B4C)
                .addField("**City:**", randomCity.getName(), true)
                .addField("**Track:**", randomTrack, true);
        return embed;
    }

    /**
     * Adds a random time of day to the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance
     * @return the modified {@link EmbedBuilder} instance
     */
    public EmbedBuilder randomizeTimeOfDay(EmbedBuilder embed) {
        TimeOfDay randomTimeOfDay = getRandomEnum(TimeOfDay.class);

        embed.setTitle("RANDOM TIME OF DAY ⏳")
                .setColor(0x1F8B4C)
                .addField("**Time of Day:**", randomTimeOfDay.getDisplayText(), false);
        return embed;
    }

    /**
     * Adds a random weather condition to the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance
     * @return the modified {@link EmbedBuilder} instance
     */
    public EmbedBuilder randomizeWeather(EmbedBuilder embed) {
        Weather randomWeather = getRandomEnum(Weather.class);

        embed.setTitle("RANDOM WEATHER ⛅️")
                .setColor(0x1F8B4C)
                .addField("**Weather:**", randomWeather.getDisplayText(), false);
        return embed;
    }

    /**
     * Generates random values for city, track, time of day, and weather, and sets them in the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance
     * @return the modified {@link EmbedBuilder} instance
     */
    public EmbedBuilder randomizeAll(EmbedBuilder embed) {
        City randomCity = getRandomEnum(City.class);
        String randomTrack = getRandomElement(randomCity.getTracks());
        CarCategory randomCategory = getRandomEnum(CarCategory.class);

        TimeOfDay randomTimeOfDay = (randomCity == City.PARIS || randomCity == City.LONG_BEACH) ?
                TimeOfDay.DAY : getRandomEnum(TimeOfDay.class);

        Weather randomWeather = (randomTimeOfDay == TimeOfDay.NIGHT) ?
                Weather.CLEAR : getRandomEnum(Weather.class);

        embed.setTitle("RANDOMIZE ALL ELEMENTS:")
                .setColor(0x1F8B4C)
                .addField("**City:**", randomCity.getName(), true)
                .addField("**Track:**", randomTrack, true)
                .addField("**Vehicle Class:**", randomCategory.getName(), true)
                .addField("**Time of Day:**", randomTimeOfDay.getDisplayText(), true)
                .addField("**Weather:**", randomWeather.getDisplayText(), true);
        return embed;
    }

    private <T extends Enum<T>> T getRandomEnum(Class<T> clazz) {
        int randomIndex = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[randomIndex];
    }

    private <T> T getRandomElement(List<T> list) {
        return list.get(random.nextInt(list.size()));
    }
}