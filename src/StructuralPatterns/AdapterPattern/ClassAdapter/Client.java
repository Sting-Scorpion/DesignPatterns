package StructuralPatterns.AdapterPattern.ClassAdapter;

import StructuralPatterns.AdapterPattern.Target;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.method1();
        target.method2();
    }
}
