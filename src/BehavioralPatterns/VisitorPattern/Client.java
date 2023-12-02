package BehavioralPatterns.VisitorPattern;

public class Client {
    public static void main(String[] args) {
        ObjectStruct obj = new ObjectStruct();
        obj.add(new NodeA());
        obj.add(new NodeB());

        Visitor visitor = new VisitorA();
        obj.action(visitor);
    }
}
