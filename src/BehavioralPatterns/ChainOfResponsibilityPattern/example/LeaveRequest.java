package BehavioralPatterns.ChainOfResponsibilityPattern.example;

public class LeaveRequest {
    private String leaverName;
    private int leaveDays;

    public LeaveRequest(String leaverName, int leaveDays) {
        this.leaverName = leaverName;
        this.leaveDays = leaveDays;
    }

    public String getLeaverName() {
        return leaverName;
    }

    public void setLeaverName(String leaverName) {
        this.leaverName = leaverName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}
