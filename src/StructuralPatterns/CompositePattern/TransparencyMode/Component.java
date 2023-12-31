package StructuralPatterns.CompositePattern.TransparencyMode;

public interface Component {
    void add(Component c);

    void remove(Component c);

    Component getChild(int i);

    Component getComposite();

    void operation();
}
