package BehavioralPatterns.ObserverPattern.example;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {
    String name;
    protected List<Observer> observers = new LinkedList<>();

    public Subject attach(Observer observer){
        observers.add(observer);
        System.out.println("---- [" + observer.getName() + " starts observing] ----");
        return this;
    }

    public Subject detach(Observer observer){
        observers.remove(observer);
        System.out.println("---- [" + observer.getName() + " stops observing] ----");
        return this;
    }

    public String getName() {
        return name;
    }

    public abstract void notifyObservers();
}
