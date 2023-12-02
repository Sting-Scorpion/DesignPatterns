package BehavioralPatterns.CommandPattern.example;

public class TVCloseCommand implements Command{
    private Television tv;

    public TVCloseCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("** [Closing the TV] **");
        tv.close();
    }
}
