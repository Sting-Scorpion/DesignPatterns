package BehavioralPatterns.CommandPattern.example;

public class TVOpenCommand implements Command{
    private Television tv;

    public TVOpenCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("** [Opening the TV] **");
        tv.open();
    }
}
