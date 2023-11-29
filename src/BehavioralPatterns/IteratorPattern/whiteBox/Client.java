package BehavioralPatterns.IteratorPattern.whiteBox;

import BehavioralPatterns.IteratorPattern.Aggregate;
import BehavioralPatterns.IteratorPattern.Iterator;

public class Client {

    public static void operation(Aggregate agg){
        Iterator iterator = agg.createIterator();
        while(!iterator.isLast()){
            System.out.print(iterator.currentItem());
            iterator.next();
            System.out.print("  ->  ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Aggregate agg = new ConcreteAggregate();
        operation(agg);
    }
}
