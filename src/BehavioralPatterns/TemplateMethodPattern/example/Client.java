package BehavioralPatterns.TemplateMethodPattern.example;

public class Client {
    public static void main(String[] args) {
        BankTemplateMethod bank;
        System.out.println("--------------------");
        bank = new Deposit();
        bank.process();
        System.out.println("--------------------");
        bank = new Withdraw();
        bank.process();;
        System.out.println("--------------------");
        bank = new OpenAccount();
        bank.process();
    }
}
