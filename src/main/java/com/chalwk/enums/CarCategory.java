/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */

package com.chalwk.enums;

import java.util.ArrayList;
import java.util.List;

public enum CarCategory {

    COMPACT_SPORTS(createCompactSportsCars()),
    SPORTS_CONVERTIBLE(createSportsConvertibleCars()),
    COUPE(createCoupeCars()),
    SPORT_UTILITY(createSportUtilityCars()),
    PACIFIC_MUSCLE(createPacificMuscleCars()),
    ROADSTER(createRoadsterCars()),
    CLASSIC(createClassicCars()),
    SPORTS_COUPE(createSportsCoupeCars()),
    AMERICAN_MUSCLE(createAmericanMuscleCars()),
    SUPER_CAR(createSuperCarCars()),
    GRAND_TOURING(createGrandTouringCars()),
    TRACK_SPECIALS(createTrackSpecialsCars()),
    EXTREME(createExtremeCars()),
    ULTIMATE(createUltimateCars()),
    PARIS_BOOSTER_PACK(createParisBoosterPackCars()),
    LONG_BEACH_BOOSTER_PACK(createLongBeachBoosterPackCars());

    private final List<String> cars;

    CarCategory(List<String> cars) {
        this.cars = cars;
    }

    private static List<String> createCompactSportsCars() {
        return new ArrayList<>() {{
            add("Lancia Delta Integrale Evo");
            add("Volkswagen R32");
            add("Renault Clio V6");
            add("Honda Civic Type-R (J)");
            add("Ford Focus RS");
            add("Volkswagen New Beetle RSi");
            add("Seat Leon Cupra R");
            add("MINI Cooper S");
        }};
    }

    private static List<String> createSportsConvertibleCars() {
        return new ArrayList<>() {{
            add("BMW Z4 3.0i");
            add("Honda S2000");
            add("Porsche Boxster S");
            add("Toyota MR2 Spyder");
            add("Mazda Miata MX-5");
            add("Audi TT Roadster");
        }};
    }

    private static List<String> createCoupeCars() {
        return new ArrayList<>() {{
            add("Audi TT 3.2 Quattro");
            add("BMW M3");
            add("Audi S4");
            add("Nissan 350Z");
            add("Honda Integra Type-R (J)");
            add("Mazda RX-8");
            add("Audi TT Coupe");
        }};
    }

    private static List<String> createSportUtilityCars() {
        return new ArrayList<>() {{
            add("Ford SVT Lighting");
            add("BMW X5 4.6is");
            add("Porsche Cayenne Turbo");
            add("Mercedes-Benz ML55 AMG");
            add("Chevrolet SSR");
            add("Volvo XC90");
        }};
    }

    private static List<String> createPacificMuscleCars() {
        return new ArrayList<>() {{
            add("Nissan Skyline GT-R (R34) Nür");
            add("Subaru Impreza WRX STi");
            add("Toyota Supra Twin-Turbo");
            add("Mazda RX-7");
            add("Mitsubishi Lancer Evolution VII");
            add("Mitsubishi 3000 GT VR4");
        }};
    }

    private static List<String> createRoadsterCars() {
        return new ArrayList<>() {{
            add("AC 427 MKII");
            add("Renault Spider");
            add("Caterham 7 Classic");
            add("Lotus 340R");
            add("Lotus Elise");
            add("Vauxhall VX220");
        }};
    }

    private static List<String> createClassicCars() {
        return new ArrayList<>() {{
            add("Ferrari 250 GTO *Bronze");
            add("Lancia Stratos");
            add("Ferrari Dino 246 GT");
            add("Ferrari 275 GB");
            add("Porsche 911 RS 2.7");
            add("Mercedes 300SL Gullwing");
            add("Jaguar E-Type");
            add("Porsche 550 Spyder");
            add("Nissan 240Z");
            add("Toyota 2000GT");
        }};
    }

    private static List<String> createSportsCoupeCars() {
        return new ArrayList<>() {{
            add("Trident Iceni");
            add("Porsche 911 Carrera Coupe (996)");
            add("Morgan Aero 8");
            add("Cadillac XLR");
            add("TVR Tamora");
            add("Audi RS6");
            add("Jaguar XKR");
            add("Lexus SC 430");
        }};
    }

    private static List<String> createAmericanMuscleCars() {
        return new ArrayList<>() {{
            add("Pontiac Trans Am");
            add("Chevrolet Camaro Z/28");
            add("Ford Mustang SVT Cobra");
            add("Ford Mustang Fastback 2+2");
            add("Chevrolet Camaro SS");
            add("Chevrolet Corvette Stingray");
            add("Pontiac GTO");
        }};
    }

    private static List<String> createSuperCarCars() {
        return new ArrayList<>() {{
            add("Delfino Feroce");
            add("TVR Tuscan Speed 6");
            add("Ferrari 360 Spider");
            add("Ferrari 360 Modena");
            add("Dodge Viper GTS");
            add("Chevrolet Corvette Z06");
            add("Porsche 911 Turbo (996)");
            add("Ferrari 355 F1");
        }};
    }

    private static List<String> createGrandTouringCars() {
        return new ArrayList<>() {{
            add("Lotus Esprit V8");
            add("Aston Marton Vanquish");
            add("Ferrari 575M Maranello");
            add("Mercedes-Benz SL55 AMG");
            add("Ferrari 550 Barchetta");
            add("Ferrari Testarossa");
            add("Bentley Continental GT");
        }};
    }

    private static List<String> createTrackSpecialsCars() {
        return new ArrayList<>() {{
            add("Ferrari Challenge Stradale");
            add("Porsche 911 GT3 (996)");
            add("Noble M12 GTO3");
            add("Honda NSX Type-R (J)");
            add("Dodge Viper SRT-10");
            add("Vauxhall VX220 Turbo");
            add("Lotus Exige");
        }};
    }

    private static List<String> createExtremeCars() {
        return new ArrayList<>() {{
            add("Ascari KZ1");
            add("Jaguar XJ220");
            add("Porsche 911 GT2 (993)");
            add("Ferrari F50");
            add("Ferrari F40");
            add("Porsche 959");
            add("Ford GT40");
        }};
    }

    private static List<String> createUltimateCars() {
        return new ArrayList<>() {{
            add("TVR Cerbera Speed 12");
            add("Porsche 911 GT1");
            add("Mercedes-Benz CLK-GTR");
            add("Pagani Zonda S");
            add("Enzo Ferrari");
            add("Koenigsegg CC V8S");
            add("Porsche Carrera GT");
            add("Ford GT");
            add("Saleen S7");
        }};
    }

    private static List<String> createParisBoosterPackCars() {
        return new ArrayList<>() {{
            add("TVR Cerbera Speed 12 (Live)");
            add("Ferrari 288 GTO");
            add("BMW 645Ci");
            add("Ferrari 365 GTS4");
            add("Porsche 356A Carrera Speedster");
            add("Ferrari 250TR");
            add("Chevrolet Corvette C6");
            add("BMW M3 CSL");
        }};
    }

    private static List<String> createLongBeachBoosterPackCars() {
        return new ArrayList<>() {{
            add("Radical SR3 Turbo");
            add("Porsche 911 GT2 Clubsport");
            add("Volkswagen Nardo");
            add("Ferrari 612 Scaglietti");
            add("Dodge Challenger R/T Hemi");
            add("Dodge RAM SRT-10");
            add("Ariel Atom 2");
            add("Subaru Impreza 22B STi");
        }};
    }

    public List<String> getCars() {
        return this.cars;
    }
}
