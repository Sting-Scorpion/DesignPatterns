package BehavioralPatterns.MediatorPattern;

public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void action();

    public void interact(){
        System.out.println("** [Colleagues call mediator] **");
        mediator.operation();
    }
}
