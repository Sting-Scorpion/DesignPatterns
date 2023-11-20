package StructuralPatterns.CompositePattern.SafetyMode;

public class Leaf implements Component{
    @Override
    public Component getComponsite() {
        System.out.println("-- No more composite --");
        System.out.println("-- Cannot get --");
        return null;
    }

    @Override
    public void operation() {
        System.out.println("[Leaf operating]");
    }
}
