package StructuralPatterns.DecoratorPattern;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operates ---");
    }
}
