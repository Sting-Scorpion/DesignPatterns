package StructuralPatterns.FlyweightPattern;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.getFlyweight("state 1");
        fly.operation("First Call");

        fly = factory.getFlyweight("state 2");
        fly.operation("Second Call");

        Flyweight newFly = factory.getFlyweight("state 1");
        newFly.operation("Third Call");

        factory.checkFlyweight();

        System.out.println("Equals? " + (newFly == factory.getFlyweight("state 1")));
    }
}
