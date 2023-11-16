package CreationalPatterns.PrototypePattern.DeepCopy;

import CreationalPatterns.PrototypePattern.ConcretePrototype;
import CreationalPatterns.PrototypePattern.NewClass;
import CreationalPatterns.PrototypePattern.Prototype;

import java.io.*;

public class Client {
    // 深拷贝方法
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype p1 = new ConcretePrototype();
        NewClass nc = new NewClass("New Class 1");
        p1.setNc(nc);

        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/CreationalPatterns/PrototypePattern/DeepCopy/tmp.txt"));
        // 写对象
        oos.writeObject(p1);
        // 释放资源
        oos.close();

        // 创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/CreationalPatterns/PrototypePattern/DeepCopy/tmp.txt"));
        // 读对象
        Prototype p2 = (Prototype) ois.readObject();
        // 释放资源
        ois.close();

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
