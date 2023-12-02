package BehavioralPatterns.MediatorPattern;

import java.util.ArrayList;

public class ConcreteMediator extends Mediator{
    @Override
    public void operation() {
        System.out.println("** [Mediator calls colleagues] **");
        for(Colleague c : colleagues){
            c.action();
        }
    }

    public void createConcreteMediator(){
        colleagues = new ArrayList<>();
    }
}
