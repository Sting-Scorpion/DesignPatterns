package StructuralPatterns.AdapterPattern.ObjectAdapter;

import StructuralPatterns.AdapterPattern.ClassAdapter.Adapter;
import StructuralPatterns.AdapterPattern.Target;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.method1();
        target.method2();
    }
}
