package StructuralPatterns.ProxyPattern.example;

public class Client {
    public static void main(String[] args) {
        AbstractPermission ap = new PermissionProxy();

        ap.modifyUserInfo();
        ap.viewNote();
        ap.publishNote();
        ap.modifyNote();

        System.out.println("------------------------------");

        ap.setLevel(1);
        ap.modifyUserInfo();
        ap.viewNote();
        ap.publishNote();
        ap.modifyNote();
    }
}
