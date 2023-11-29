package BehavioralPatterns.ChainOfResponsibilityPattern;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }

    public abstract void handleRequest(String request);
}
