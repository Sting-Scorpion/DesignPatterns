package BehavioralPatterns.VisitorPattern;

public class NodeA extends Node{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return "Node A is visited";
    }
}
