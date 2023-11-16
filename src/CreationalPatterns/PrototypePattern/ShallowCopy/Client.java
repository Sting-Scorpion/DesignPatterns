package CreationalPatterns.PrototypePattern.ShallowCopy;

import CreationalPatterns.PrototypePattern.ConcretePrototype;
import CreationalPatterns.PrototypePattern.NewClass;
import CreationalPatterns.PrototypePattern.Prototype;

public class Client {
    // 浅拷贝方法
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new ConcretePrototype();
        NewClass nc = new NewClass("New Class 1");

        p1.setNc(nc);
        Prototype p2 = (Prototype) p1.clone();
        p1.show();
        p2.show();

        System.out.println("\tp1 == p2 ?\t\t\t\t" + (p1 == p2));
        System.out.println("\tp1.class == p2.class ?\t" + (p1.getClass() == p2.getClass()));
        System.out.println("\tp1.nc == p2.nc ?\t\t" + (p1.getNc() == p2.getNc()));

        p2.setNCs("new class 2");
        p1.show();
        p2.show();
    }
}
