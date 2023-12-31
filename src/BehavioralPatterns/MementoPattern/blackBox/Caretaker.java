package BehavioralPatterns.MementoPattern.blackBox;

public class Caretaker {
    private MementoIF memento;

    public MementoIF retrieveMemento(){
        return memento;
    }

    public void saveMemento(MementoIF memento){
        this.memento = memento;
    }
}
