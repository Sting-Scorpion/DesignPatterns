package BehavioralPatterns.MementoPattern.whiteBox;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        CareTaker ct = new CareTaker();

        o.setState("on");
        ct.setMemento(o.createMemento());

        o.setState("off");
        o.restoreMemento(ct.getMemento());
    }
}
