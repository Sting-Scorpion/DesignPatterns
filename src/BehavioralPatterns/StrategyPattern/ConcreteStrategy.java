package BehavioralPatterns.StrategyPattern;

public class ConcreteStrategy extends Strategy{
    @Override
    public void strategyInterface() {
        System.out.println("algorithm A");
    }
}
