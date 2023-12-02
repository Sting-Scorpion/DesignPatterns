package BehavioralPatterns.MediatorPattern.example;

import java.util.HashMap;
import java.util.Map;

public class ChatGroup extends AbstractChatRoom{
    public ChatGroup() {
        members = new HashMap<>();
    }

    @Override
    public void register(Member m) {
        if(!members.containsKey(m.getName())){
            members.put(m.getName(), m);
            m.setChatRoom(this);
        }
    }

    @Override
    public void cancel(Member m) {
        members.remove(m.getName());
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member target = members.get(to);
        target.receiveText(from, message);
    }

    @Override
    public void sendImage(String from, String to, String img) {
        Member target = members.get(to);
        if(img.length() > 5){
            System.out.println("-- [Image too large to send] --");
            System.out.println("（Failed）");
        }
        else{
            target.receiveImage(from, img);
        }
    }
}
