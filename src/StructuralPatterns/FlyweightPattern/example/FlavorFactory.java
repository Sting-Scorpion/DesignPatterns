package StructuralPatterns.FlyweightPattern.example;

import java.util.ArrayList;

public class FlavorFactory {
    private ArrayList<Order> orders;
    private int ordersMade;

    public FlavorFactory() {
        orders = new ArrayList<>();
        ordersMade = 0;
    }

    public Order getOrder(String flavorOrdered){
        if(ordersMade > 0){
            for(int i = 0; i  <ordersMade; i ++){
                if(flavorOrdered.equals(orders.get(i).getFlavor())){
                    return orders.get(i);
                }
            }
        }
        orders.add(new Flavor(flavorOrdered));
        return orders.get(ordersMade++);
    }

    public int getTotalFlavor(){
        return orders.size();
    }
}
