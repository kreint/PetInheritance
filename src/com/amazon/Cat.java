package com.amazon;

public class Cat extends Pet {

    private static final String CAT_SPECIES_NAME = "cat";

    public Cat(String itsName) {
        super(itsName);
    }

    @Override
    public String getSpeciesName() {
        return CAT_SPECIES_NAME;
    }

    @Override
    public String getActivity(double randomNumber) {
        String activity = CatActivity.PURRING;
        if (randomNumber < 0.75) {
            activity = CatActivity.SLEEPING;
        } else if (randomNumber < 0.8) {
            activity = CatActivity.EATING;
        } else if (randomNumber < 0.85) {
            activity = CatActivity.GROOMING;
        } else if (randomNumber < 0.9) {
            activity = CatActivity.PLAYING;
        } else if (randomNumber < 0.93) {
            activity = CatActivity.CLIMBING;
        } else if (randomNumber < 0.97) {
            activity = CatActivity.HUNTING;
        }
        return activity;
    }
}
