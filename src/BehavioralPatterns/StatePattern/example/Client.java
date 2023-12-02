package BehavioralPatterns.StatePattern.example;

public class Client {
    public static void main(String[] args) {
        ForumAccount account = new ForumAccount("Butcher");
        account.writeNote(20);
        account.downloadFile(10);
        account.writeNote(180);
        account.downloadFile(80);
        account.downloadFile(150);
        account.writeNote(20);
        account.downloadFile(100);
    }
}
