package StructuralPatterns.BridgePattern;

public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImpl(implementor);
        abstraction.operation();
    }
}
