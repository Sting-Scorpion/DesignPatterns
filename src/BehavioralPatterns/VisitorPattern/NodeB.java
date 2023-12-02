package BehavioralPatterns.VisitorPattern;

public class NodeB extends Node{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){
        return "Node B is visited";
    }
}
