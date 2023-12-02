package BehavioralPatterns.InterpreterPattern.example;

public class Client {
    public static void main(String[] args) {
        String statement = "4 * 9 / 6";
        Calculator c = new Calculator();
        c.build(statement);
        System.out.println(statement + " = " + c.compute());
    }
}
