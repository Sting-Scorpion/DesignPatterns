package BehavioralPatterns.ObserverPattern.example;

public class Cat extends Subject{
    public Cat(String name){
        this.name = name;
        System.out.println("---- [" + name + " appears] ----");
    }

    @Override
    public void notifyObservers() {
        System.out.println("---- [Cat meows] ----");
        for(Observer observer : observers){
            System.out.println(name + " notifies " + observer.getName());
            observer.response();
        }
    }

    @Override
    public Subject detach(Observer observer){
        super.detach(observer);
        if(observer.getClass() == Mouse.class){
            System.out.println("\t (" + name + " kills " + observer.getName() + ")");
        }
        else{
            System.out.println("\t (" + observer.getName() + " runs away)");
        }
        return this;
    }
}
