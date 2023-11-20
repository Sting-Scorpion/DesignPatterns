package StructuralPatterns.DecoratorPattern;

public class Decorator implements Component{
    private Component component;

    public Decorator(){}

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
