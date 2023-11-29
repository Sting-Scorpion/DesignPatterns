package BehavioralPatterns.IteratorPattern;

public interface Iterator {
    void first();

    void next();

    boolean isLast();

    Object currentItem();
}
