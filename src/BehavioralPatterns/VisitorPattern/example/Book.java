package BehavioralPatterns.VisitorPattern.example;

public class Book extends Product{
    public Book(int p) {
        super(p);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
