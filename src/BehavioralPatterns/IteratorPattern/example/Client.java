package BehavioralPatterns.IteratorPattern.example;

public class Client {
    public static void display(Television tv){
        TVIterator i = tv.createIterator();
        System.out.println("All channels:");
        i.showList();

        System.out.println("Traverse all channels:");
        while(!i.isLast()){
            System.out.println("(" + i.currentChannel() + ")");
            i.next();
        }
        System.out.println("(" + i.currentChannel() + ")");

        System.out.println("Go Next");
        i.next();
        System.out.println("(" + i.currentChannel() + ")");

        System.out.println("Go Previous");
        i.previous();
        System.out.println("(" + i.currentChannel() + ")");
    }

    public static void main(String[] args) {
        Television tv = new TCLTelevision();
        Object[] channels = {"CCTV-1", "CCTV-2", "CCTV-3", "BBC"};
        tv.setObjs(channels);

        display(tv);
    }
}
