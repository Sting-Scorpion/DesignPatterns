package BehavioralPatterns.VisitorPattern.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> list;

    public Basket() {
        list = new ArrayList<>();
    }

    public void accept(Visitor v){
        for(Product p : list){
            p.accept(v);
        }
    }

    public Basket addProduct(Product p){
        list.add(p);
        return this;
    }

    public void removeProduct(Product p){
        list.remove(p);
    }
}
