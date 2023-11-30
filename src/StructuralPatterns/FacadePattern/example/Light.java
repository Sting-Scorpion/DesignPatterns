package StructuralPatterns.FacadePattern.example;

public class Light {
    private String position;

    public Light(String position) {
        this.position = position;
    }

    public void turnOn(){
        System.out.println("-- [turn on the " + position + " light] --");
    }

    public void turnOff(){
        System.out.println("** [turn off the " + position + " light] **");
    }
}
