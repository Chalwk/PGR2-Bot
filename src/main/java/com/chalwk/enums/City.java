/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */

package com.chalwk.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum City {

    BARCELONA("Barcelona", createBarcelonaTracks()),
    CHICAGO("Chicago", createChicagoTracks()),
    FLORENCE("Florence", createFlorenceTracks()),
    HONGKONG("Hong Kong", createHongKongTracks()),
    NURBURGRING("Nurburgring", createNurburgringTracks()),
    SYDNEY("Sydney", createSydneyTracks()),
    WASHINGTON_DC("Washington DC", createWashingtonDCTracks()),
    MOSCOW("Moscow", createMoscowTracks()),
    STOCKHOLM("Stockholm", createStockholmTracks()),
    YOKOHAMA("Yokohama", createYokohamaTracks()),
    PARIS("Paris", createParisTracks()),
    LONG_BEACH("Long Beach", createLongBeachTracks()),
    EDINBURGH("Edinburgh", createEdinburghTracks());

    private final List<String> tracks;

    City(String name, List<String> tracks) {
        this.tracks = Collections.unmodifiableList(tracks);
    }

    private static List<String> createBarcelonaTracks() {
        return new ArrayList<>() {{
            add("Barri Gotic");
            add("Catalan Challenge");
            add("Catedral");
            add("Las Ramblas");
            add("Passeig de Colom");
            add("Place de Jaume");
        }};
    }

    private static List<String> createChicagoTracks() {
        return new ArrayList<>() {{
            add("Chicago River Tour");
            add("East Kinzie Crossover");
            add("East On Wacker");
            add("In The Loop");
            add("Lower Wacker Run");
            add("North Wabash Overpass");
            add("River Crossing");
            add("The Miracle Mile");
            add("Wells & Lake");
            add("West On Wacker");
        }};
    }

    private static List<String> createEdinburghTracks() {
        return new ArrayList<>() {{
            add("Castle Eight");
            add("Grassmarket East");
            add("Grassmarket Eight");
            add("Grassmarket West");
            add("Lothian Road Eight Long");
            add("Lothian Road Eight");
            add("Princess Street East");
            add("Princess Street Long");
            add("Princess Street Loop");
            add("Terrace Sprint");
        }};
    }

    private static List<String> createFlorenceTracks() {
        return new ArrayList<>() {{
            add("Arno");
            add("Arno 2");
            add("Battistero 1");
            add("Battistero 2");
            add("Duomo 1");
            add("Duomo 2");
            add("Piazza della Repubblica");
            add("Piazza della Signoria 1");
            add("Piazza della Signoria 2");
            add("Ponte Vecchio");
            add("Uffizi");
        }};
    }

    private static List<String> createHongKongTracks() {
        return new ArrayList<>() {{
            add("Admiralty");
            add("Cotton Tree Drive");
            add("Harbour Run");
            add("Harcourt Challenge");
            add("Hennessy Road");
            add("The Convention Centres");
            add("The Waterfront");
            add("Wan Chai Run");
        }};
    }

    private static List<String> createMoscowTracks() {
        return new ArrayList<>() {{
            add("KGB Corner");
            add("Kremlin 1");
            add("Kremlin 2");
            add("Lenin");
            add("Red Square 1");
            add("Red Square 2");
            add("St. Basil's Circle");
        }};
    }

    private static List<String> createNurburgringTracks() {
        return new ArrayList<>() {{
            add("Nürburgring");
        }};
    }

    private static List<String> createStockholmTracks() {
        return new ArrayList<>() {{
            add("Bridges");
            add("Gamla Island Hopping");
            add("Gamla Oval");
            add("Gamla Stan Loop");
            add("Island Hop");
            add("Northern");
            add("Northern 2");
            add("Northern 3");
            add("Round the Riksdagshuset");
            add("Speed Freak");
        }};
    }

    private static List<String> createSydneyTracks() {
        return new ArrayList<>() {{
            add("Argyle Street");
            add("Cumberland Street");
            add("Dawes Point Loop");
            add("Downtown Short");
            add("George St. Challenge");
            add("Harbour Bridge");
            add("Hickson Run");
            add("Opera House View");
            add("Sydney Harbour");
            add("The Rocks Route");
            add("The Wharf");
            add("Under the Bridge");
        }};
    }

    private static List<String> createWashingtonDCTracks() {
        return new ArrayList<>() {{
            add("Capitol Thrill");
            add("Capitol Thrill 2");
            add("Northside Slide");
            add("Northside Slide");
            add("Ring Race");
            add("Square Dancin'");
            add("The Tour");
            add("Up and Over");
        }};
    }

    private static List<String> createYokohamaTracks() {
        return new ArrayList<>() {{
            add("Downtown");
            add("Honcho dori");
            add("Kishamichi");
            add("Minato Mirai");
            add("Sakuragicho");
            add("Seaside Loop");
            add("Shinko Park");
            add("Warehouse Loop");
            add("Yokohama Bay Tour");
            add("Yokohama Challenge");
        }};
    }

    private static List<String> createParisTracks() {
        return new ArrayList<>() {{
            add("Avenue D'lena");
            add("Circuit Interieur");
            add("Elysees Challenge");
            add("L'Arc de Triomphe");
            add("Le Circuit Comple");
            add("Les Deux Ponts");
            add("Les Monuments Celebres");
        }};
    }

    private static List<String> createLongBeachTracks() {
        return new ArrayList<>() {{
            add("Aquarium");
            add("CC Circular");
            add("Coastal Run");
            add("Dolphin Loop");
            add("LBC (Long Beach City)");
            add("Long Beach Challenge");
            add("Ocean Boulevard");
            add("Rainbow Lagoon");
        }};
    }

    public List<String> getTracks() {
        return tracks;
    }
}