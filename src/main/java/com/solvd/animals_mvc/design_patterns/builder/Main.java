package com.solvd.animals_mvc.design_patterns.builder;

public class Main {
    public static void main(String[] args) {
        Plane acrobaticcPlane = new Plane.Builder()
                .enginesNumber(2)
                .wingsNumber(2)
                .capacity(1)
                .build();

        Plane commercialPlane = new Plane.Builder()
                .company("LATAM Airlines")
                .commercial(true)
                .enginesNumber(8)
                .wingsNumber(2)
                .capacity(100)
                .build();
    }
}
