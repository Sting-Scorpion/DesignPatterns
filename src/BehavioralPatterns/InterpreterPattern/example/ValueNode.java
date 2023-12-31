package BehavioralPatterns.InterpreterPattern.example;

public class ValueNode implements Node{
    private double value;

    public ValueNode(double value) {
        this.value = value;
    }

    @Override
    public double interpret() {
        return value;
    }
}
