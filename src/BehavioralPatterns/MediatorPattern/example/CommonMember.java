package BehavioralPatterns.MediatorPattern.example;

public class CommonMember extends Member{
    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("-- [Common member sends a text] --");
        chatRoom.sendText(name, to, message);
    }

    @Override
    public void sendImage(String to, String img) {
        System.out.println("-- [Common member cannot send image] --");
    }
}
