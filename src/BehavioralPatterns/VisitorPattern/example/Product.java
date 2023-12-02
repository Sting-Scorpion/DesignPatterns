package BehavioralPatterns.VisitorPattern.example;

public abstract class Product {
    protected int price;

    public int getPrice(){
        return price;
    }

    public Product(int price) {
        this.price = price;
    }

    public abstract void accept(Visitor v);
}
