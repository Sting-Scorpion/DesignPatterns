package StructuralPatterns.FlyweightPattern.example;

public interface Order {
    void serve(Table table);

    String getFlavor();
}
