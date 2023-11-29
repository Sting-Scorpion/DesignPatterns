package BehavioralPatterns.MementoPattern.blackBox;

public class Originator {
    private String state;

    public Originator() {
    }

    public MementoIF createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(MementoIF memento){
        Memento mem = (Memento) memento;
        setState(mem.getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("- [state = *" + state + "*] -");
    }

    protected class Memento implements MementoIF{
        private String savedState;

        public Memento(String state) {
            savedState = state;
        }

        public String getState() {
            return savedState;
        }

        public void setState(String state) {
            savedState = state;
        }
    }
}
