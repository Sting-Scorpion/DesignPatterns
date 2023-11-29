package BehavioralPatterns.IteratorPattern.whiteBox;

import BehavioralPatterns.IteratorPattern.Aggregate;
import BehavioralPatterns.IteratorPattern.Iterator;

public class ConcreteAggregate extends Aggregate {
    private Object[] objs = {"dog", "cat", "monkey", "pig", "cat"};

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getElement(int index){
        if(index < objs.length){
            return objs[index];
        }
        else{
            return null;
        }
    }

    public int size(){
        return objs.length;
    }
}
