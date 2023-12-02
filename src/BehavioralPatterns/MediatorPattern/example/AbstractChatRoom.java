package BehavioralPatterns.MediatorPattern.example;

import java.util.Iterator;
import java.util.Map;

public abstract class AbstractChatRoom {
    protected Map<String, Member> members;

    public abstract void register(Member m);

    public abstract void cancel(Member m);

    public abstract void sendText(String from, String to, String message);

    public abstract void sendImage(String from, String to, String img);

    public void listMembers(){
        System.out.println("****************************************");
        for (String name : members.keySet()) {
            Member member = members.get(name);
            if(member.getClass() == VIPMember.class){
                System.out.println("** $$  " + name + "  $$ **");
            }
            else{
                System.out.println("** " + name + " **");
            }
        }
        System.out.println("****************************************");
    }
}
