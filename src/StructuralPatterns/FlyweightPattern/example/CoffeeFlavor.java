package StructuralPatterns.FlyweightPattern.example;

import java.util.Random;

public enum CoffeeFlavor {
    Cappuccino, Espresso, Americano;

    public static String getRandomFlavor(){
        Random random = new Random();
        return values()[random.nextInt(values().length)].toString();
    }
}
