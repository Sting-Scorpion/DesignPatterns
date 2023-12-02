package BehavioralPatterns.VisitorPattern.example;

public class Apple extends Product{
    private int weight;

    public Apple(int weight, int price) {
        super(price);
        this.weight = weight;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public int getRealPrice() {
        return weight * price;
    }

    public int getWeight() {
        return weight;
    }
}
