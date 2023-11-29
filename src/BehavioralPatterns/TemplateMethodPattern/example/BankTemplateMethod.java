package BehavioralPatterns.TemplateMethodPattern.example;

public abstract class BankTemplateMethod {
    public void process(){
        takeNumber();
        transact();
        if(isValid()){
            checkBalance();
        }
        evaluate();
    }

    void takeNumber(){
        System.out.println("-- [Take a number] --");
        System.out.println("(Waiting)");
    }

    abstract void transact();

    boolean isValid(){
        return true;
    }

    void checkBalance(){
        System.out.println("-- [Checking balance] --");
        System.out.println("(Finish)");
    }

    void evaluate(){
        System.out.println("-- [Evaluate this service] --");
        System.out.println("(Finish)");
    }
}
