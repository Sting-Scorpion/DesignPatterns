package StructuralPatterns.CompositePattern.TransparencyMode;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite();
        Component c1 = new Composite();
        c1.add(new Leaf());
        root.add(c1);
        Component c2 = new Composite();
        c2.add(new Leaf());
        c2.add(new Leaf());
        root.add(c2);

        root.operation();
    }
}
