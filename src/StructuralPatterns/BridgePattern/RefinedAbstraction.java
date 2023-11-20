package StructuralPatterns.BridgePattern;

public class RefinedAbstraction extends Abstraction{
    @Override
    public void operation() {
        System.out.println("-- Refining --");
        impl.operationalImpl();
        System.out.println("-- Refined --");
    }
}
