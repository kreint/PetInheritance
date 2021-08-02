package com.amazon;

public class Dog extends Pet {

    private static final String DOG = "dog";

    public Dog(String itsName) {
        super(itsName);
    }

    @Override
    public String getSpeciesName() {
        return DOG;
    }

    @Override
    public String getActivity(double randomNumber) {
        String activity = DogActivity.BARKING;
        if (randomNumber < 0.4) {
            activity = DogActivity.SLEEPING;
        } else if (randomNumber < 0.5) {
            activity = DogActivity.EATING;
        } else if (randomNumber < 0.6) {
            activity = DogActivity.WALKING;
        } else if (randomNumber < 0.7) {
            activity = DogActivity.PLAYING;
        } else if (randomNumber < 0.8) {
            activity = DogActivity.WAGGING;
        } else if (randomNumber < 0.9) {
            activity = DogActivity.RUNNING;
        } else if (randomNumber < 0.95) {
            activity = DogActivity.HUNTING;
        }
        return activity;
    }
}
