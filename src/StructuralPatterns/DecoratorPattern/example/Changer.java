package StructuralPatterns.DecoratorPattern.example;

public class Changer extends Transformer {
    private Transformer transformer;

    public Changer(Transformer transformer) {
        this.transformer = transformer;
        System.out.println("-- We have " + transformer.getName() + " --");
    }

    @Override
    public void move() {
        transformer.move();
    }

    public void change(){
        System.out.println("-- [" + transformer.getName() + " transforming] --");
    }

    public Transformer getTransformer() {
        return transformer;
    }
}
