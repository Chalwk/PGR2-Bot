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

public class RandomGenerator {

    public EmbedBuilder randomizeVehicleClass(EmbedBuilder embed) {
        Random random = new Random();
        CarCategory randomCategory = CarCategory.values()[random.nextInt(CarCategory.values().length)];

        embed.setTitle("PGR2 🏎️ |  RANDOM CLASS 🎲:");
        embed.addField("🛠️ Vehicle Class:", randomCategory.name(), false);

        return embed;
    }

    public EmbedBuilder randomizeVehicle(EmbedBuilder embed) {
        Random random = new Random();
        CarCategory randomCategory = CarCategory.values()[random.nextInt(CarCategory.values().length)];
        List<String> cars = randomCategory.getCars();
        int randomCarIndex = random.nextInt(cars.size());
        String randomCar = cars.get(randomCarIndex);

        embed.setTitle("PGR2 🏎️ |  RANDOM VEHICLE 🚗:");
        embed.addField(" Vehicle:", randomCar, false);

        return embed;
    }

    public EmbedBuilder randomizeTrack(EmbedBuilder embed) {
        City randomCity = City.values()[new Random().nextInt(City.values().length)];
        List<String> tracks = randomCity.getTracks();

        Random random = new Random();
        int randomTrackIndex = random.nextInt(tracks.size());
        String randomTrack = tracks.get(randomTrackIndex);

        embed.setTitle("PGR2 🏎️ |  RANDOM TRACK 🛣️:");
        embed.addField(" City:", randomCity.name(), false);
        embed.addField(" Track:", randomTrack, false);

        return embed;
    }

    public EmbedBuilder randomizeTimeOfDay(EmbedBuilder embed) {
        TimeOfDay randomTimeOfDay = TimeOfDay.values()[new Random().nextInt(TimeOfDay.values().length)];

        embed.setTitle("PGR2 🏎️ |  RANDOM TIME OF DAY ⏳:");
        embed.addField(" Time of Day:", randomTimeOfDay.getDisplayText(), false);

        return embed;
    }

    public EmbedBuilder randomizeWeather(EmbedBuilder embed) {
        Weather randomWeather = Weather.values()[new Random().nextInt(Weather.values().length)];

        embed.setTitle("PGR2 🏎️ |  RANDOM WEATHER ⛅️:");
        embed.addField(" Weather:", randomWeather.getDisplayText(), false);

        return embed;
    }

    public EmbedBuilder randomizeAll(EmbedBuilder embed) {
        // City and track
        City randomCity = City.values()[new Random().nextInt(City.values().length)];
        List<String> tracks = randomCity.getTracks();
        int randomTrackIndex = new Random().nextInt(tracks.size());
        String randomTrack = tracks.get(randomTrackIndex);

        // Time of day
        TimeOfDay randomTimeOfDay = TimeOfDay.values()[new Random().nextInt(TimeOfDay.values().length)];

        // Conditional check for Paris or Long Beach
        boolean isParisOrLongBeach = randomCity == City.PARIS || randomCity == City.LONG_BEACH;

        // Conditional check for nighttime
        boolean isNightTime = randomTimeOfDay == TimeOfDay.NIGHT;

        // Weather
        Weather randomWeather;
        if (isParisOrLongBeach || isNightTime) {
            // Force clear weather if it's Paris/Long Beach or night
            randomWeather = Weather.CLEAR;
        } else {
            randomWeather = Weather.values()[new Random().nextInt(Weather.values().length)];
        }

        embed.setTitle("PGR2 🏎️ |  RANDOM ALL 🎲:");
        embed.addField(" City:", randomCity.name(), false);
        embed.addField(" Track:", randomTrack, false);
        embed.addField(" Time of Day:", randomTimeOfDay.getDisplayText(), false);
        embed.addField(" Weather:", randomWeather.getDisplayText(), false);

        return embed;
    }
}
