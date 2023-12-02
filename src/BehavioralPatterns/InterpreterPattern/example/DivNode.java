package BehavioralPatterns.InterpreterPattern.example;

public class DivNode extends SymbolNode{
    public DivNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double interpret() {
        return super.left.interpret() / super.right.interpret();
    }
}
