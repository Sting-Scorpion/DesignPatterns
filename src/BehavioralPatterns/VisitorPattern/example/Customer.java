package BehavioralPatterns.VisitorPattern.example;

public class Customer extends Visitor{

    @Override
    public void visit(Apple apple) {
        System.out.println("-- [Customer: " + name + " buys apples] --");
        System.out.println("(Price: " + apple.getPrice() + ", weight: " + apple.getWeight() + ")");
    }

    @Override
    public void visit(Book book) {
        System.out.println("-- [Customer: " + name + " buys books] --");
        System.out.println("(Price: " + book.getPrice() + ")");
    }
}
