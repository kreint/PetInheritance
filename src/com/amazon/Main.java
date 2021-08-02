package com.amazon;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Felix");
        Dog dog = new Dog("Fido");

        for (int hour = 0; hour < 24; ++hour) {
            cat.performActivity();
            dog.performActivity();
        }

    }
}
