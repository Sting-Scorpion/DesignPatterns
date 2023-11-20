package StructuralPatterns.DecoratorPattern.example;

public class Plane extends Changer{
    public Plane(Transformer transformer) {
        super(transformer);
        System.out.println("(" + transformer.getName() + " can fly like a plane)");
    }

    public void fly(){
        System.out.println("-- [" + super.getTransformer().getName() +" flies as a plane] --");
    }
}
