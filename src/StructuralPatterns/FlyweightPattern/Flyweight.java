package StructuralPatterns.FlyweightPattern;

public abstract class Flyweight {
    protected String intrinsicState;

    public Flyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public abstract void operation(String extrinsicState);
}
