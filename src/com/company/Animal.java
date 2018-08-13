package com.company;

abstract class Animal {

    abstract String animalType();

    public int getNumberOfLegs(String animalType) {
        if (animalType == "wild") {
            return 4;
        } else if (animalType == "pet") {
            return 2;
        } else {
            return 1;
        }

    }
}
