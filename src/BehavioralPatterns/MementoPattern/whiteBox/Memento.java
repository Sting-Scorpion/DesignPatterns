package BehavioralPatterns.MementoPattern.whiteBox;

public class Memento {
    private String state;

    public Memento(Originator o){
        state = o.getState();
        System.out.println("-- [Memento recording state: *" + state + "*] --");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
