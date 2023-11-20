package StructuralPatterns.DecoratorPattern.example;

public class Car extends Changer{
    public Car(Transformer transformer) {
        super(transformer);
        System.out.println("(" + transformer.getName() + " can change to a car)");
    }

    public void run(){
        System.out.println("-- [" + super.getTransformer().getName() +" runs as a car] --");
    }
}
