package BehavioralPatterns.MementoPattern.whiteBox;

public class CareTaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
        System.out.println("--- [Set memento, state is: *" + memento.getState() + "*] ---");
    }
}
