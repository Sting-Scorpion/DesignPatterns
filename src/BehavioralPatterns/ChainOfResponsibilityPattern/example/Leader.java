package BehavioralPatterns.ChainOfResponsibilityPattern.example;

public abstract class Leader {
    protected String name;
    protected Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Leader getSuccessor() {
        return successor;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveRequest leaveRequest);
}
