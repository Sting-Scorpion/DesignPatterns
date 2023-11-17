package BehavioralPatterns.ObserverPattern.example;

public class Mouse extends Observer{
    public Mouse(String name){
        this.name = name;
    }

    @Override
    public void response() {
        System.out.println("---- [" + name + " has been notified] ----");
        System.out.println("---- [Mouse escapes] ----");
    }
}
