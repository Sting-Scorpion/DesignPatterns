package CreationalPatterns.PrototypePattern.example;

import java.io.IOException;

public class TheGreatestSage {
    private Monkey monkey = new Monkey();

    public void copy()
            throws IOException, ClassNotFoundException, InterruptedException {
        Monkey copyMonkey;
        Thread.sleep(1000);
        System.out.println("分身");
        copyMonkey = (Monkey) monkey.deepClone(); // 深拷贝
//        copyMonkey = (Monkey) monkey.clone(); // 浅拷贝
        System.out.println("Monkey King's birth: " + monkey.getBirthDate());
        System.out.println("Copy Monkey's birth: " + copyMonkey.getBirthDate());
        System.out.println("\tMonkey King == Copy Monkey? " + (monkey == copyMonkey));
        System.out.println("\tMonkey King's staff == Copy Monkey's staff? " + (monkey.getStaff() == copyMonkey.getStaff()));
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        TheGreatestSage sun = new TheGreatestSage();
        sun.copy();
    }
}
