package BehavioralPatterns.TemplateMethodPattern;

public abstract class AbstractClass {
    public void templateMethod(){
        operation1();
        operation2();
    }

    public void operation1(){
        System.out.println("-- [Operation 1] --");
    }

    public abstract void operation2();
}
