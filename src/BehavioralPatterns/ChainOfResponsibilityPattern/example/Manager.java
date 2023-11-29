package BehavioralPatterns.ChainOfResponsibilityPattern.example;

public class Manager extends Leader{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays() < 10){
            System.out.println("-- [Manager: " + getName() + " approves] --");
            System.out.println("---- [Employee: " + leaveRequest.getLeaverName() + " leaves for " + leaveRequest.getLeaveDays() + " days] ----");
        }
        else{
            if(getSuccessor() != null){
                System.out.println("- ["+ getName() + " forwards request to Leader " + getSuccessor().getName() + "] -");
                getSuccessor().handleRequest(leaveRequest);
            }
            else{
                System.out.println("- [Request fail] -");
            }
        }
    }
}
