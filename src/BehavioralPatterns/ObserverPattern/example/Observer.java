package BehavioralPatterns.ObserverPattern.example;

public abstract class Observer {
    String name;
    public abstract void response();

    public String getName() {
        return name;
    }
}
