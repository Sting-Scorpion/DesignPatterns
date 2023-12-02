package BehavioralPatterns.CommandPattern.example;

public class Client {
    public static void main(String[] args) {
        Television tv = new Television();
        Command openCommand = new TVOpenCommand(tv);
        Command closeCommand = new TVCloseCommand(tv);
        Command changeCommand = new TVChangeCommand(tv);

        Controller controller = new Controller(openCommand, closeCommand, changeCommand);

        controller.open();
        controller.change();
        controller.close();
    }
}
