package BehavioralPatterns.TemplateMethodPattern.example;

public class Deposit extends BankTemplateMethod{
    @Override
    void transact() {
        System.out.println("-- [Depositing money] --");
        System.out.println("(Finish)");
    }

    @Override
    void checkBalance() {
        System.out.println("-- [Confirming balance] --");
        System.out.println("(Confirmed)");
    }
}
