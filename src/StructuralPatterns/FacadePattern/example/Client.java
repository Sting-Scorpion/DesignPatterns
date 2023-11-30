package StructuralPatterns.FacadePattern.example;

public class Client {
    public static void main(String[] args) {
        GeneralSwitchFacade gsf = GeneralSwitchFacade.getGeneralSwitchFacade();
        System.out.println("(Go into the room)");
        gsf.on();
        System.out.println("(Working)");
        gsf.off();
        System.out.println("(Leave the room)");
    }
}
