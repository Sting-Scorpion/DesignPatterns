package BehavioralPatterns.TemplateMethodPattern;

public class ConcreteClass extends AbstractClass{
    @Override
    public void operation2() {
        System.out.print("(SubClass)");
        System.out.println("-- [operation 2] --");
    }
}
