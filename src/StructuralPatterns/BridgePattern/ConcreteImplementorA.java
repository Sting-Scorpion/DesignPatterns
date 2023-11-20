package StructuralPatterns.BridgePattern;

public class ConcreteImplementorA implements Implementor{
    @Override
    public void operationalImpl() {
        System.out.println("[A doing something]");
    }
}
