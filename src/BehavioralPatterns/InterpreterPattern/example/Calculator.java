package BehavioralPatterns.InterpreterPattern.example;

import java.util.Stack;

public class Calculator {
    private Node node;

    public void build(String s){
        Node left;
        Node right;
        Stack<Node> stack = new Stack<>();

        String[] statementArr = s.split(" ");

        for(int i = 0; i < statementArr.length; i++){
            if(statementArr[i].equalsIgnoreCase("*")){
                left = stack.pop();
                double val = Double.parseDouble(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new MulNode(left, right));
            }
            else if(statementArr[i].equalsIgnoreCase("/")){
                left = stack.pop();
                double val = Double.parseDouble(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new DivNode(left, right));
            }
            else{
                stack.push(new ValueNode(Double.parseDouble(statementArr[i])));
            }
        }
        node = stack.pop();
    }

    public double compute(){
        return node.interpret();
    }
}
