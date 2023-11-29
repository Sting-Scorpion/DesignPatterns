package BehavioralPatterns.IteratorPattern.example;

public abstract class Television {
    public abstract TVIterator createIterator();

    public abstract void setObjs(Object[] objs);
}
