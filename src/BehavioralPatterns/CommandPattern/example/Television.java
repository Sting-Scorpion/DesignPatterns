package BehavioralPatterns.CommandPattern.example;

public class Television {
    public void open(){
        System.out.println("-- [Turn on the TV] --");
    }

    public void close(){
        System.out.println("-- [Turn off the TV] --");
    }

    public void changeChannel(){
        System.out.println("-- [Change the channel] --");
    }
}
