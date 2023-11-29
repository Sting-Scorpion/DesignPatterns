package BehavioralPatterns.IteratorPattern.blackBox;

import BehavioralPatterns.IteratorPattern.Aggregate;
import BehavioralPatterns.IteratorPattern.Iterator;

public class ConcreteAggregate extends Aggregate {
    private Object[] objs = {"dog", "cat", "monkey", "pig", "cat"};

    public Iterator createIterator(){
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator{
        private int index = 0;
        @Override
        public void first() {
            index = 0;
        }

        @Override
        public void next() {
            if(index < objs.length){
                index++;
            }
        }

        @Override
        public boolean isLast() {
            return index >= objs.length;
        }

        @Override
        public Object currentItem() {
            return objs[index];
        }
    }
}
