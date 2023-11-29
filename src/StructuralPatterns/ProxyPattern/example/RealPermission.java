package StructuralPatterns.ProxyPattern.example;

public class RealPermission implements AbstractPermission{
    @Override
    public void modifyUserInfo() {
        System.out.println("-- [Modify User Information] --");
    }

    @Override
    public void viewNote() {

    }

    @Override
    public void publishNote() {
        System.out.println("-- [Publish new note] --");
    }

    @Override
    public void modifyNote() {
        System.out.println("-- [Modify note] --");
    }

    @Override
    public void setLevel(int level) {

    }
}
