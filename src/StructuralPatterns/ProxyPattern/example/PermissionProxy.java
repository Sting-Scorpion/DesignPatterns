package StructuralPatterns.ProxyPattern.example;

public class PermissionProxy implements AbstractPermission{
    private RealPermission rp = new RealPermission();
    private int level = 0;

    @Override
    public void modifyUserInfo() {
        if(level == 0){
            System.out.println("(You have no permission to modify information)");
        }
        else if(level == 1){
            rp.modifyUserInfo();
        }
    }

    @Override
    public void viewNote() {
        System.out.println("--- [View notes] ---");
    }

    @Override
    public void publishNote() {
        if(level == 0){
            System.out.println("(You have no permission to publish notes)");
        }
        else if(level == 1){
            rp.publishNote();
        }
    }

    @Override
    public void modifyNote() {
        if(level == 0){
            System.out.println("(You have no permission to modify notes)");
        }
        else if(level == 1){
            rp.modifyNote();
        }
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
