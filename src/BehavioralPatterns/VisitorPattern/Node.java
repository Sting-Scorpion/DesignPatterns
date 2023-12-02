package BehavioralPatterns.VisitorPattern;

public abstract class Node {
    public abstract void accept(Visitor visitor);
}
