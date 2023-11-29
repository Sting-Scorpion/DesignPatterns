package BehavioralPatterns.ChainOfResponsibilityPattern.example;

public class Client {
    public static void main(String[] args) {
        Leader director = new Director("Hakis");
        Leader manager = new Manager("Gen");
        director.setSuccessor(manager);
        Leader boss = new Boss("Hal");
        manager.setSuccessor(boss);

        System.out.println("***************************************");
        LeaveRequest lr1 = new LeaveRequest("Roiee", 2);
        director.handleRequest(lr1);

        System.out.println("***************************************");
        LeaveRequest lr2 = new LeaveRequest("Zero", 7);
        director.handleRequest(lr2);

        System.out.println("***************************************");
        LeaveRequest lr3 = new LeaveRequest("Yuki", 15);
        director.handleRequest(lr3);

        System.out.println("***************************************");
        LeaveRequest lr4 = new LeaveRequest("jv", 40);
        director.handleRequest(lr4);

        System.out.println("***************************************");
    }
}
