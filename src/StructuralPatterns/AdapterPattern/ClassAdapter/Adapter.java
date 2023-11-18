package StructuralPatterns.AdapterPattern.ClassAdapter;

import StructuralPatterns.AdapterPattern.Adaptee;
import StructuralPatterns.AdapterPattern.Target;

public class Adapter extends Adaptee implements Target {
    public void method1(){
        System.out.print("Adapter: ");
        super.method1();
    }

    @Override
    public void method2() {
        System.out.print("Adapter: ");
        System.out.println(super.method3());
    }
}
