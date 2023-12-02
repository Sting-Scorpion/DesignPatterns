package BehavioralPatterns.CommandPattern.example;

public class TVChangeCommand implements Command{
    private Television tv;

    public TVChangeCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("** [Changing channel] **");
        tv.changeChannel();
    }
}
