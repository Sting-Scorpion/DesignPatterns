package StructuralPatterns.DecoratorPattern.example;

public class Client {
    public static void main(String[] args) {
        Transformer bumblebee = new Robot("Bumblebee");
        bumblebee.move();

        System.out.println("------------------------------");

        Car camaro = new Car(bumblebee);
        camaro.move();
        camaro.change();
        camaro.run();
    }
}
