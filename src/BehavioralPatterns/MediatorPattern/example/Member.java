package BehavioralPatterns.MediatorPattern.example;

public abstract class Member {
    protected AbstractChatRoom chatRoom;
    protected String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(AbstractChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public abstract void sendText(String to, String message);

    public abstract void sendImage(String to, String img);

    public void receiveText(String from, String message){
        System.out.println("** " + name + " received text from " + from + " **");
        System.out.println("** message: [" + message + "] **");
    }

    public void receiveImage(String from, String image){
        System.out.println("** " + name + " received image from " + from + " **");
        System.out.println("** image: [" + image + "] **");
    }
}
