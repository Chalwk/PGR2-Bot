/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */

package com.chalwk.enums;

import java.util.List;

public enum CarCategory {

    COMPACT_SPORTS("Compact Sports", List.of(
            "Lancia Delta Integrale Evo",
            "Volkswagen R32",
            "Renault Clio V6",
            "Honda Civic Type-R (J)",
            "Ford Focus RS",
            "Volkswagen New Beetle RSi",
            "Seat Leon Cupra R",
            "MINI Cooper S"
    )),

    SPORTS_CONVERTIBLE("Sports Convertible", List.of(
            "BMW Z4 3.0i",
            "Honda S2000",
            "Porsche Boxster S",
            "Toyota MR2 Spyder",
            "Mazda Miata MX-5",
            "Audi TT Roadster"
    )),

    COUPE("Coupe", List.of(
            "Audi TT 3.2 Quattro",
            "BMW M3",
            "Audi S4",
            "Nissan 350Z",
            "Honda Integra Type-R (J)",
            "Mazda RX-8",
            "Audi TT Coupe"
    )),

    SPORT_UTILITY("Sport Utility", List.of(
            "Ford SVT Lighting",
            "BMW X5 4.6is",
            "Porsche Cayenne Turbo",
            "Mercedes-Benz ML55 AMG",
            "Chevrolet SSR",
            "Volvo XC90"
    )),

    PACIFIC_MUSCLE("Pacific Muscle", List.of(
            "Nissan Skyline GT-R (R34) Nür",
            "Subaru Impreza WRX STi",
            "Toyota Supra Twin-Turbo",
            "Mazda RX-7",
            "Mitsubishi Lancer Evolution VII",
            "Mitsubishi 3000 GT VR4"
    )),

    ROADSTER("Roadster", List.of(
            "AC 427 MKII",
            "Renault Spider",
            "Caterham 7 Classic",
            "Lotus 340R",
            "Lotus Elise",
            "Vauxhall VX220"
    )),

    CLASSIC("Classic", List.of(
            "Ferrari 250 GTO *Bronze",
            "Lancia Stratos",
            "Ferrari Dino 246 GT",
            "Ferrari 275 GB",
            "Porsche 911 RS 2.7",
            "Mercedes 300SL Gullwing",
            "Jaguar E-Type",
            "Porsche 550 Spyder",
            "Nissan 240Z",
            "Toyota 2000GT"
    )),

    SPORTS_COUPE("Sports Coupe", List.of(
            "Trident Iceni",
            "Porsche 911 Carrera Coupe (996)",
            "Morgan Aero 8",
            "Cadillac XLR",
            "TVR Tamora",
            "Audi RS6",
            "Jaguar XKR",
            "Lexus SC 430"
    )),

    AMERICAN_MUSCLE("American Muscle", List.of(
            "Pontiac Trans Am",
            "Chevrolet Camaro Z/28",
            "Ford Mustang SVT Cobra",
            "Ford Mustang Fastback 2+2",
            "Chevrolet Camaro SS",
            "Chevrolet Corvette Stingray",
            "Pontiac GTO"
    )),

    SUPER_CAR("Super Car", List.of(
            "Delfino Feroce",
            "TVR Tuscan Speed 6",
            "Ferrari 360 Spider",
            "Ferrari 360 Modena",
            "Dodge Viper GTS",
            "Chevrolet Corvette Z06",
            "Porsche 911 Turbo (996)",
            "Ferrari 355 F1"
    )),

    GRAND_TOURING("Grand Touring", List.of(
            "Lotus Esprit V8",
            "Aston Marton Vanquish",
            "Ferrari 575M Maranello",
            "Mercedes-Benz SL55 AMG",
            "Ferrari 550 Barchetta",
            "Ferrari Testarossa",
            "Bentley Continental GT"
    )),

    TRACK_SPECIALS("Track Specials", List.of(
            "Ferrari Challenge Stradale",
            "Porsche 911 GT3 (996)",
            "Noble M12 GTO3",
            "Honda NSX Type-R (J)",
            "Dodge Viper SRT-10",
            "Vauxhall VX220 Turbo",
            "Lotus Exige"
    )),

    EXTREME("Extreme", List.of(
            "Ascari KZ1",
            "Jaguar XJ220",
            "Porsche 911 GT2 (993)",
            "Ferrari F50",
            "Ferrari F40",
            "Porsche 959",
            "Ford GT40"
    )),

    ULTIMATE("Ultimate", List.of(
            "TVR Cerbera Speed 12",
            "Porsche 911 GT1",
            "Mercedes-Benz CLK-GTR",
            "Pagani Zonda S",
            "Enzo Ferrari",
            "Koenigsegg CC V8S",
            "Porsche Carrera GT",
            "Ford GT",
            "Saleen S7"
    )),

    PARIS_BOOSTER_PACK("Paris Booster Pack", List.of(
            "TVR Cerbera Speed 12 (Live)",
            "Ferrari 288 GTO",
            "BMW 645Ci",
            "Ferrari 365 GTS4",
            "Porsche 356A Carrera Speedster",
            "Ferrari 250TR",
            "Chevrolet Corvette C6",
            "BMW M3 CSL"
    )),

    LONG_BEACH_BOOSTER_PACK("Long Beach Booster Pack", List.of(
            "Radical SR3 Turbo",
            "Porsche 911 GT2 Clubsport",
            "Volkswagen Nardo",
            "Ferrari 612 Scaglietti",
            "Dodge Challenger R/T Hemi",
            "Dodge RAM SRT-10",
            "Ariel Atom 2",
            "Subaru Impreza 22B STi"
    ));

    private final String name;
    private final List<String> cars;

    CarCategory(String name, List<String> cars) {
        this.name = name;
        this.cars = List.copyOf(cars);
    }

    public String getName() {
        return name;
    }

    public List<String> getCars() {
        return this.cars;
    }
}