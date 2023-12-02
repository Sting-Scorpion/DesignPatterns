package BehavioralPatterns.VisitorPattern;

public class VisitorB implements Visitor{
    @Override
    public void visit(NodeA a) {
        System.out.println("[Visitor B visiting]");
        System.out.println(a.operationA());
    }

    @Override
    public void visit(NodeB b) {
        System.out.println("[Visitor B visiting]");
        System.out.println(b.operationB());
    }
}
