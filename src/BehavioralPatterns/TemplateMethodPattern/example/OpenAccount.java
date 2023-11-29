package BehavioralPatterns.TemplateMethodPattern.example;

public class OpenAccount extends BankTemplateMethod{
    @Override
    void transact() {
        System.out.println("-- [Opening new account] --");
        System.out.println("(Created)");
    }

    @Override
    boolean isValid() {
        return false;
    }
}
