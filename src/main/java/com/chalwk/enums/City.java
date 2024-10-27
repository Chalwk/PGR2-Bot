/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */

package com.chalwk.enums;

import java.util.List;

public enum City {

    BARCELONA("Barcelona", List.of(
            "Barri Gotic",
            "Catalan Challenge",
            "Catedral",
            "Las Ramblas",
            "Passeig de Colom",
            "Place de Jaume")),

    CHICAGO("Chicago", List.of(
            "Chicago River Tour",
            "East Kinzie Crossover",
            "East On Wacker",
            "In The Loop",
            "Lower Wacker Run",
            "North Wabash Overpass",
            "River Crossing",
            "The Miracle Mile",
            "Wells & Lake",
            "West On Wacker")),

    EDINBURGH("Edinburgh", List.of(
            "Castle Eight",
            "Grassmarket East",
            "Grassmarket Eight",
            "Grassmarket West",
            "Lothian Road Eight Long",
            "Lothian Road Eight",
            "Princess Street East",
            "Princess Street Long",
            "Princess Street Loop",
            "Terrace Sprint")),

    FLORENCE("Florence", List.of(
            "Arno",
            "Arno 2",
            "Battistero 1",
            "Battistero 2",
            "Duomo 1",
            "Duomo 2",
            "Piazza della Repubblica",
            "Piazza della Signoria 1",
            "Piazza della Signoria 2",
            "Ponte Vecchio",
            "Uffizi")),

    HONGKONG("Hong Kong", List.of(
            "Admiralty",
            "Cotton Tree Drive",
            "Harbour Run",
            "Harcourt Challenge",
            "Hennessy Road",
            "The Convention Centres",
            "The Waterfront",
            "Wan Chai Run")),

    MOSCOW("Moscow", List.of(
            "KGB Corner",
            "Kremlin 1",
            "Kremlin 2",
            "Lenin",
            "Red Square 1",
            "Red Square 2",
            "St. Basil's Circle")),

    NURBURGRING("Nurburgring", List.of("Nürburgring")),

    STOCKHOLM("Stockholm", List.of(
            "Bridges",
            "Gamla Island Hopping",
            "Gamla Oval",
            "Gamla Stan Loop",
            "Island Hop",
            "Northern",
            "Northern 2",
            "Northern 3",
            "Round the Riksdagshuset",
            "Speed Freak")),

    SYDNEY("Sydney", List.of(
            "Argyle Street",
            "Cumberland Street",
            "Dawes Point Loop",
            "Downtown Short",
            "George St. Challenge",
            "Harbour Bridge",
            "Hickson Run",
            "Opera House View",
            "Sydney Harbour",
            "The Rocks Route",
            "The Wharf",
            "Under the Bridge")),

    WASHINGTON_DC("Washington DC", List.of(
            "Capitol Thrill",
            "Capitol Thrill 2",
            "Northside Slide",
            "Ring Race",
            "Square Dancin'",
            "The Tour",
            "Up and Over")),

    YOKOHAMA("Yokohama", List.of(
            "Downtown",
            "Honcho dori",
            "Kishamichi",
            "Minato Mirai",
            "Sakuragicho",
            "Seaside Loop",
            "Shinko Park",
            "Warehouse Loop",
            "Yokohama Bay Tour",
            "Yokohama Challenge")),

    PARIS("Paris", List.of(
            "Avenue D'lena",
            "Circuit Interieur",
            "Elysees Challenge",
            "L'Arc de Triomphe",
            "Le Circuit Comple",
            "Les Deux Ponts",
            "Les Monuments Celebres")),

    LONG_BEACH("Long Beach", List.of(
            "Aquarium",
            "CC Circular",
            "Coastal Run",
            "Dolphin Loop",
            "LBC (Long Beach City)",
            "Long Beach Challenge",
            "Ocean Boulevard",
            "Rainbow Lagoon"));

    private final String name;
    private final List<String> tracks;

    City(String name, List<String> tracks) {
        this.name = name;
        this.tracks = List.copyOf(tracks);
    }

    public String getName() {
        return name;
    }

    public List<String> getTracks() {
        return tracks;
    }
}