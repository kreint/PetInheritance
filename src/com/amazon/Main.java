package com.amazon;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Felix");
        Dog dog = new Dog("Fido");

//        int[] inclusiveHours = IntStream.rangeClosed(0, 23).toArray();
//        int[] exclusiveHours = IntStream.range(0, 24).toArray();

        for (int hour = 0; hour < 24; ++hour) {
            cat.performActivity();
            dog.performActivity();
        }

//        int hour = 0;
//        while (hour < 24) {
//            cat.performActivity();
//            dog.performActivity();
//            ++hour;
//        }

//        int hour = 0;
//        do {
//            cat.performActivity();
//            dog.performActivity();
//            hour++;
//        } while (hour < 24);

//        for (int hour : inclusiveHours) {
//            System.out.println("inclusive hour=" + hour);
//            cat.performActivity();
//            dog.performActivity();
//        }
//
//        for (int hour : exclusiveHours) {
//            System.out.println("exclusive hour=" + hour);
//            cat.performActivity();
//            dog.performActivity();
//        }

    }
}
