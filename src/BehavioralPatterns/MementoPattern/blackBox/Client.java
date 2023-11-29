package BehavioralPatterns.MementoPattern.blackBox;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker ct = new Caretaker();

        o.setState("On");
        ct.saveMemento(o.createMemento());

        o.setState("Off");
        o.restoreMemento(ct.retrieveMemento());
    }
}
