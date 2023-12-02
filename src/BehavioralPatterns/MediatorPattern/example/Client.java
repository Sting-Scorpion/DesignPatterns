package BehavioralPatterns.MediatorPattern.example;

public class Client {
    public static void main(String[] args) {
        AbstractChatRoom chatroom = new ChatGroup();

        Member member1 = new CommonMember("Tom");
        chatroom.register(member1);
        Member member2 = new VIPMember("Jack");
        chatroom.register(member2);
        Member member3 = new VIPMember("Peter");
        chatroom.register(member3);
        Member member4 = new CommonMember("David");
        chatroom.register(member4);
        Member member5 = new CommonMember("Barry");
        chatroom.register(member5);

        member1.sendImage("Jack", "Image1.jpg");
        member1.sendText("Jack", "Hello");

        member2.sendText("Tom", "Hi");
        member2.sendImage("David", "1.png");

        member3.sendImage("Barry", "Image2.png");
        member3.sendText("Barry", "Received?");

        member5.sendText("Peter", "No");

        chatroom.cancel(member4);

        chatroom.listMembers();
    }
}
