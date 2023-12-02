package BehavioralPatterns.VisitorPattern.example;

public class Client {
    public static void main(String[] args) {
        Product b1 = new Book(15);
        Product a1 = new Apple(3, 2);
        Product b2 = new Book(42);

        Visitor v1 = new Cashier();
        v1.setName("Wills");
        Visitor v2 = new Customer();
        v2.setName("Bill");

        Basket basket = new Basket();

        basket.addProduct(b1)
                .addProduct(b2)
                .addProduct(a1);
        basket.accept(v2);

        basket.removeProduct(b1);

        basket.accept(v1);
    }
}
