package BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{
    protected ArrayList observers = new ArrayList();
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Object obj: observers){
            System.out.println("Notify:");
            ((Observer) obj).update();
        }
    }
}
