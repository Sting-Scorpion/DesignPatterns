package BehavioralPatterns.MediatorPattern;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createConcreteMediator();
        Colleague c1 = new Colleague1(mediator);
        mediator.register(c1);
        Colleague c2 = new Colleague2(mediator);
        mediator.register(c2);
        mediator.operation();

        c1.interact();
    }
}
