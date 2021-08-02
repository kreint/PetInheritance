package com.amazon;

import java.util.Random;

public abstract class Pet implements Animal {

    public void performActivity() {
        System.out.println(String.format("A %s named %s is %s.", getSpeciesName(), getIndividualName(), getActivity()));
    }

    public abstract String getSpeciesName();

    private String individualName;

    public Pet(String itsName) {
        individualName = itsName;
    }

    public String getIndividualName() {
        return individualName;
    };

    /**
     * Gets an activity from the Pet.  Repeated calls will return various activities that are common to this Pet.
     * @return
     */
    private String getActivity() {
        double random = new Random().nextDouble();
        return getActivity(random);
    }

    /**
     * Performs a Pet-specific activity based on an input random number between 0 and 1.
     * Each Pet will determine its own set of activities and how frequently they perform these activities.
     * @param randomNumber
     * @return the name of the activity that the Pet performs.
     */
    public abstract String getActivity(double randomNumber);


}
