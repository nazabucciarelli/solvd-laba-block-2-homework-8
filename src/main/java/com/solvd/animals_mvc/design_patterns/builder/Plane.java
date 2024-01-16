package com.solvd.animals_mvc.design_patterns.builder;

public class Plane {
    private final String company;
    private final int capacity;
    private final int wingsNumber;
    private final int enginesNumber;
    private final boolean commercial;

    public Plane(String company, int capacity, int wingsNumber, int enginesNumber,
                 boolean commercial) {
        this.company = company;
        this.capacity = capacity;
        this.wingsNumber = wingsNumber;
        this.enginesNumber = enginesNumber;
        this.commercial = commercial;
    }

    public static class Builder {
        private String company;
        private int capacity;
        private int wingsNumber;
        private int enginesNumber;
        private boolean commercial;

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public Builder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder wingsNumber(int wingsNumber) {
            this.wingsNumber = wingsNumber;
            return this;
        }

        public Builder enginesNumber(int enginesNumber) {
            this.enginesNumber = enginesNumber;
            return this;
        }

        public Builder commercial(boolean commercial) {
            this.commercial = commercial;
            return this;
        }

        public Plane build() {
            return new Plane(company, capacity, wingsNumber, enginesNumber,
                    commercial);
        }
    }
}
