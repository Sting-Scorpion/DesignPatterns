package BehavioralPatterns.VisitorPattern.example;

public class Cashier extends Visitor{
    @Override
    public void visit(Apple apple) {
        System.out.println("-- [Cashier " + name + " calculates the apples' price] --");
        System.out.println("(Real price: " + apple.getRealPrice() + ")");
    }

    @Override
    public void visit(Book book) {
        System.out.println("-- [Cashier " + name + " calculates the price of the books] --");
        System.out.println("(Price: " + book.getPrice() + ")");
    }
}
