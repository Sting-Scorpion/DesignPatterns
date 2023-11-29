package BehavioralPatterns.MementoPattern.example;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> stateStack;
    private int version;

    public Caretaker() {
        stateStack = new Stack<>();
        version = 0;
    }

    public Memento restoreLastMemento(){
        System.out.println("-- [Restore to version " + --version + "] --");
        return stateStack.pop();
    }

    public void createMemento(Memento memento){
        System.out.println("-- [Version " + version + " stored] --");
        version++;
        stateStack.push(memento);
    }
}
