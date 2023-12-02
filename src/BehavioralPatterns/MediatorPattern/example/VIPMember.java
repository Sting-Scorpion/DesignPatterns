package BehavioralPatterns.MediatorPattern.example;

public class VIPMember extends Member{
    public VIPMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("-- [VIP member sends a text] --");
        chatRoom.sendText(name, to, message);
    }

    @Override
    public void sendImage(String to, String img) {
        System.out.println("-- [VIP member sends an image] --");
        chatRoom.sendImage(name, to, img);
    }
}
