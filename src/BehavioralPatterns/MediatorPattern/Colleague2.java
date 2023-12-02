package BehavioralPatterns.MediatorPattern;

public class Colleague2 extends Colleague{
    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("-- [This is an action from Colleague 2] --");
    }
}
