package BehavioralPatterns.StrategyPattern;

public class Context {
    private Strategy strategy;

    public void contextInterface(){
        strategy.strategyInterface();
    }

    public void setStrategy(Strategy strategy) {
        System.out.println("Choosing strategy:");
        this.strategy = strategy;
    }
}
