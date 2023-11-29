package BehavioralPatterns.MementoPattern.whiteBox;

public class Originator {
    private String state;

    public Memento createMemento(){
        return new Memento(this);
    }

    public void restoreMemento(Memento memento){
        System.out.println("- [Restoring state] -");
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("- [Now the state is: *" + state + "*] -");
        this.state = state;
    }
}
