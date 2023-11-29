package BehavioralPatterns.MementoPattern.example;

public class Client {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker ct = new Caretaker();

        user.setAccount("James")
                .setPassword("123456")
                .setTel("13000045");
        user.show();
        ct.createMemento(user.saveMemento());

        user.setPassword("66668888")
                .setTel("15226666");
        user.show();
        ct.createMemento(user.saveMemento());

        user.setAccount("Timmy");
        user.show();
        user.restoreMemento(ct.restoreLastMemento());
        user.show();
        user.restoreMemento(ct.restoreLastMemento());
        user.show();
    }
}
