package BehavioralPatterns.TemplateMethodPattern.example;

public class Withdraw extends BankTemplateMethod{
    @Override
    void transact() {
        System.out.println("-- [Withdrawing money] --");
        System.out.println("(Finish)");
    }
}
