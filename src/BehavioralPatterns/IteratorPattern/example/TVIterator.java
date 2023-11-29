package BehavioralPatterns.IteratorPattern.example;

public interface TVIterator {
    void setChannel(int i);

    void first();

    void next();

    void previous();

    void last();

    boolean isLast();

    boolean isFirst();

    Object currentChannel();

    void showList();
}
