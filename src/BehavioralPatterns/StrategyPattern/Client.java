package BehavioralPatterns.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategy());
        context.contextInterface();
    }
}
