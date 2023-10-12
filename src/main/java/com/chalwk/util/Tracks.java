/* Copyright (c) 2023, PGR2-Bot. Jericho Crosby <jericho.crosby227@gmail.com> */
package com.chalwk.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tracks {

    public static Map<String, ArrayList> tracksMap = new HashMap<>();
    public static ArrayList<String> barcelona = new ArrayList<>() {{
        add("Barri Gotic");
        add("Catalan Challenge");
        add("Catedral");
        add("Las Ramblas");
        add("Passeig de Colom");
        add("Place de Jaume");
    }};
    public static ArrayList<String> chicago = new ArrayList<>() {{
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
    public static ArrayList<String> edinburgh = new ArrayList<>() {{
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
    public static ArrayList<String> florence = new ArrayList<>() {{
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
    public static ArrayList<String> hongKong = new ArrayList<>() {{
        add("Admiralty");
        add("Cotton Tree Drive");
        add("Harbour Run");
        add("Harcourt Challenge");
        add("Hennessy Road");
        add("The Convention Centres");
        add("The Waterfront");
        add("Wan Chai Run");
    }};
    public static ArrayList<String> moscow = new ArrayList<>() {{
        add("KGB Corner");
        add("Kremlin 1");
        add("Kremlin 2");
        add("Lenin");
        add("Red Square 1");
        add("Red Square 2");
        add("St. Basil's Circle");
    }};
    public static ArrayList<String> nurburgring = new ArrayList<>() {{
        add("Nürburgring");
    }};
    public static ArrayList<String> stockholm = new ArrayList<>() {{
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
    public static ArrayList<String> sydney = new ArrayList<>() {{
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
    public static ArrayList<String> washingtonDC = new ArrayList<>() {{
        add("Capitol Thrill");
        add("Capitol Thrill 2");
        add("Northside Slide");
        add("Northside Slide");
        add("Ring Race");
        add("Square Dancin'");
        add("The Tour");
        add("Up and Over");
    }};
    public static ArrayList<String> yokohama = new ArrayList<>() {{
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
    public static ArrayList<String> paris = new ArrayList<>() {{
        add("Avenue D'lena");
        add("Circuit Interieur");
        add("Elysees Challenge");
        add("L'Arc de Triomphe");
        add("Le Circuit Comple");
        add("Les Deux Ponts");
        add("Les Monuments Celebres");
    }};


    //==================================\\
    // DLC Tracks:
    //==================================\\

    public static ArrayList<String> longbeach = new ArrayList<>() {{
        add("Aquarium");
        add("CC Circular");
        add("Coastal Run");
        add("Dolphin Loop");
        add("LBC (Long Beach City)");
        add("Long Beach Challenge");
        add("Ocean Boulevard");
        add("Rainbow Lagoon");
    }};

    public static void populateTracks() {
        tracksMap.put("Barcelona", barcelona);
        tracksMap.put("Chicago", chicago);
        tracksMap.put("Edinburgh", edinburgh);
        tracksMap.put("Florence", florence);
        tracksMap.put("Hong Kong", hongKong);
        tracksMap.put("Moscow", moscow);
        tracksMap.put("Nürburgring", nurburgring);
        tracksMap.put("Stockholm", stockholm);
        tracksMap.put("Sydney", sydney);
        tracksMap.put("Washington, D.C.", washingtonDC);
        tracksMap.put("Yokohama", yokohama);
        tracksMap.put("Paris", paris);
        tracksMap.put("Long Beach", longbeach);
    }
}
