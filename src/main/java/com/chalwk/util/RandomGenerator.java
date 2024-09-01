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
 * A utility class for generating random game elements in PGR2 Discord Bot.
 */
public class RandomGenerator {

    /**
     * Generates a random vehicle class and sets it as a field in the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance to add the field
     * @return the modified {@link EmbedBuilder} instance with the new field
     */
    public EmbedBuilder randomizeVehicleClass(EmbedBuilder embed) {
        Random random = new Random();
        CarCategory randomCategory = CarCategory.values()[random.nextInt(CarCategory.values().length)];

        embed.setTitle("PGR2 🏎️ |  RANDOM CLASS 🎲:");
        embed.addField("Vehicle Class:", "- " + randomCategory.getName(), true);

        return embed;
    }

    /**
     * Generates a random vehicle and sets it as a field in the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance to add the field
     * @return the modified {@link EmbedBuilder} instance with the new field
     */
    public EmbedBuilder randomizeVehicle(EmbedBuilder embed) {
        Random random = new Random();
        CarCategory randomCategory = CarCategory.values()[random.nextInt(CarCategory.values().length)];
        List<String> cars = randomCategory.getCars();
        int randomCarIndex = random.nextInt(cars.size());
        String randomCar = cars.get(randomCarIndex);

        embed.setTitle("PGR2 🏎️ |  RANDOM VEHICLE 🚗:");
        embed.addField("Vehicle:", "- " + randomCar, true);

        return embed;
    }

    /**
     * Generates a random track and sets it as a field in the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance to add the field
     * @return the modified {@link EmbedBuilder} instance with the new field
     */
    public EmbedBuilder randomizeTrack(EmbedBuilder embed) {
        Random random = new Random();
        City randomCity = City.values()[random.nextInt(City.values().length)];
        List<String> tracks = randomCity.getTracks();

        int randomTrackIndex = random.nextInt(tracks.size());
        String randomTrack = tracks.get(randomTrackIndex);

        embed.setTitle("PGR2 🏎️ |  RANDOM TRACK 🛣️:");
        embed.addField("City:", "- " + randomCity.getName(), true);
        embed.addField("Track:", "- " + randomTrack, true);

        return embed;
    }

    /**
     * Generates a random time of day and sets it as a field in the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance to add the field
     * @return the modified {@link EmbedBuilder} instance with the new field
     */
    public EmbedBuilder randomizeTimeOfDay(EmbedBuilder embed) {
        TimeOfDay randomTimeOfDay = TimeOfDay.values()[new Random().nextInt(TimeOfDay.values().length)];

        embed.setTitle("PGR2 🏎️ |  RANDOM TIME OF DAY ⏳:");
        embed.addField("Time of Day:", "- " + randomTimeOfDay.getDisplayText(), true);

        return embed;
    }

    /**
     * Generates a random weather condition and sets it as a field in the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance to add the field
     * @return the modified {@link EmbedBuilder} instance with the new field
     */
    public EmbedBuilder randomizeWeather(EmbedBuilder embed) {
        Weather randomWeather = Weather.values()[new Random().nextInt(Weather.values().length)];

        embed.setTitle("PGR2 🏎️ |  RANDOM WEATHER ⛅️:");
        embed.addField("Weather:", "- " + randomWeather.getDisplayText(), true);

        return embed;
    }

    /**
     * Generates random values for city, track, time of day, and weather, and sets them as fields in the provided embed.
     *
     * @param embed the {@link EmbedBuilder} instance to add the fields
     * @return the modified {@link EmbedBuilder} instance with the new fields
     */
    public EmbedBuilder randomizeAll(EmbedBuilder embed) {

        Random random = new Random();
        City randomCity = City.values()[random.nextInt(City.values().length)];
        List<String> tracks = randomCity.getTracks();
        int randomTrackIndex = random.nextInt(tracks.size());
        String randomTrack = tracks.get(randomTrackIndex);

        CarCategory randomCategory = CarCategory.values()[random.nextInt(CarCategory.values().length)];
        List<String> cars = randomCategory.getCars();
        int randomCarIndex = random.nextInt(cars.size());
        String randomCar = cars.get(randomCarIndex);

        TimeOfDay randomTimeOfDay;
        Weather randomWeather;

        if (randomCity == City.PARIS || randomCity == City.LONG_BEACH) {
            randomTimeOfDay = TimeOfDay.DAY;
        } else {
            randomTimeOfDay = TimeOfDay.values()[random.nextInt(TimeOfDay.values().length)];
        }

        if (randomTimeOfDay == TimeOfDay.NIGHT) {
            randomWeather = Weather.CLEAR;
        } else {
            randomWeather = Weather.values()[random.nextInt(Weather.values().length)];
        }

        embed.setTitle("RANDOMIZE ALL ELEMENTS:");
        embed.addField(" City:", "- " + randomCity.getName(), true);
        embed.addField(" Track:", "- " + randomTrack, true);
        embed.addField(" Car:", "- " + randomCar, true);
        embed.addField(" Time of Day:", "- " + randomTimeOfDay.getDisplayText(), true);
        embed.addField(" Weather:", "- " + randomWeather.getDisplayText(), true);

        return embed;
    }
}