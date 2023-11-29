package BehavioralPatterns.IteratorPattern.whiteBox;

import BehavioralPatterns.IteratorPattern.Iterator;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate agg;
    private int index;
    private int size;

    public ConcreteIterator(ConcreteAggregate agg) {
        this.agg = agg;
        size = agg.size();
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if(index < size){
            index++;
        }
    }

    @Override
    public boolean isLast() {
        return index >= size;
    }

    @Override
    public Object currentItem() {
        return agg.getElement(index);
    }
}
