package StructuralPatterns.DecoratorPattern;

public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation(){
        super.operation();
        System.out.println("ConcreteBehavior operates ---");
        addBehavior();
    }

    public void addBehavior(){
        System.out.println("New Behavior added ---");
    }
}
