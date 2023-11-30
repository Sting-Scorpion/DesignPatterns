package StructuralPatterns.FlyweightPattern;

public class ConcreteFlyweight extends Flyweight{

    public ConcreteFlyweight(String intrinsicState) {
        super(intrinsicState);
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Intrinsic state = " + intrinsicState);
        System.out.println("Extrinsic state = " + extrinsicState);
    }
}
