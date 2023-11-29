package BehavioralPatterns.ChainOfResponsibilityPattern.example;

public class Boss extends Leader{
    public Boss(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays() < 30){
            System.out.println("-- [Boss: " + getName() + " approves] --");
            System.out.println("---- [Employee: " + leaveRequest.getLeaverName() + " leaves for " + leaveRequest.getLeaveDays() + " days] ----");
        }
        else{
            System.out.println("-- [Boss doesn't approve " + leaveRequest.getLeaverName() + "'s " + leaveRequest.getLeaveDays() + " days leave]--");
        }
    }
}
