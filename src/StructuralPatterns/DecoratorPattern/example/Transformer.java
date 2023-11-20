package StructuralPatterns.DecoratorPattern.example;

public abstract class Transformer {
    String name;
    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
