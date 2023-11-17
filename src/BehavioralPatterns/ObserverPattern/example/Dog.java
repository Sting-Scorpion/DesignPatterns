package BehavioralPatterns.ObserverPattern.example;

public class Dog extends Observer{
    public Dog(String name){
        this.name = name;
    }
    @Override
    public void response() {
        System.out.println("---- [" + name + " has been notified] ----");
        System.out.println("---- [Dog barks] ----");
    }
}
