package BehavioralPatterns.MediatorPattern;

import java.util.ArrayList;

public abstract class Mediator {
    protected ArrayList<Colleague> colleagues;
    public abstract void operation();

    public void register(Colleague c){
        colleagues.add(c);
    }
}
