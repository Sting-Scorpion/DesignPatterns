package StructuralPatterns.FlyweightPattern.example;

public class Client {
    public static void main(String[] args) {
        FlavorFactory factory = new FlavorFactory();
        for(int i = 0; i < 10; i++){
            factory.getOrder(CoffeeFlavor.getRandomFlavor()).serve(new Table(i));
        }

        System.out.println("Total flavors: " + factory.getTotalFlavor());
    }
}
