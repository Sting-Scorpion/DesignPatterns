package BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
