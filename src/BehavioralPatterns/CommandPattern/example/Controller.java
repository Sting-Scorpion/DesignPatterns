package BehavioralPatterns.CommandPattern.example;

public class Controller {
    private Command openCommand, closeCommand, changeCommand;

    public Controller(Command openCommand, Command closeCommand, Command changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }

    public void open(){
        openCommand.execute();
    }

    public void close(){
        closeCommand.execute();
    }

    public void change(){
        changeCommand.execute();
    }
}
