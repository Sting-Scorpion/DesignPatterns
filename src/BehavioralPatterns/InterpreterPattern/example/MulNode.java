package BehavioralPatterns.InterpreterPattern.example;

public class MulNode extends SymbolNode{
    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double interpret() {
        return super.left.interpret() * super.right.interpret();
    }
}
