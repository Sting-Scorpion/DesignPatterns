package StructuralPatterns.DecoratorPattern.example;

public class Robot extends Transformer {
    @Override
    public void move() {
        System.out.println("-- [" + name + " moves as a robot] --");
    }

    public Robot(String name) {
        System.out.println("-- [" + name +  " is a robot] --");
        this.name = name;
    }
}
