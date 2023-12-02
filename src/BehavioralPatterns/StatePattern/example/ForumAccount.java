package BehavioralPatterns.StatePattern.example;

public class ForumAccount {
    private AbstractState state;
    private String name;

    public ForumAccount(String name) {
        this.name = name;
        state = new PrimaryState(this);
        System.out.println("-- [" + name + " registered successfully] --");
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public void writeNote(int score){
        state.writeNote(score);
    }

    public void downloadFile(int score){
        state.downloadFile(score);
    }
}
