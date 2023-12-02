package BehavioralPatterns.VisitorPattern;

import java.util.ArrayList;

public class ObjectStruct {
    private ArrayList<Node> nodes;

    public ObjectStruct() {
        nodes = new ArrayList<>();
    }

    public void action(Visitor v){
        for(Node n : nodes){
            n.accept(v);
        }
    }

    public void add(Node n){
        nodes.add(n);
    }
}
