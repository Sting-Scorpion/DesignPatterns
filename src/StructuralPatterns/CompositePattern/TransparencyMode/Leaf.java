package StructuralPatterns.CompositePattern.TransparencyMode;

public class Leaf implements Component{
    @Override
    public void add(Component c) {
        System.out.println("-- No more component --");
        System.out.println("-- Cannot add --");
    }

    @Override
    public void remove(Component c) {
        System.out.println("-- No more component --");
        System.out.println("-- Cannot remove --");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("-- No more component --");
        System.out.println("-- No more children --");
        return null;
    }

    @Override
    public Component getComposite() {
        System.out.println("-- No more composite --");
        System.out.println("-- Cannot get --");
        return null;
    }

    @Override
    public void operation() {
        System.out.println("[Leaf operating]");
    }
}
