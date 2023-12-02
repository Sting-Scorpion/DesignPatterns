package BehavioralPatterns.CommandPattern;

public class ConcreteCommand extends Command{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("-- [Sending command] --");
        receiver.action();
    }
}
