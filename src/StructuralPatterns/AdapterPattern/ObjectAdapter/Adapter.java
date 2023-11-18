package StructuralPatterns.AdapterPattern.ObjectAdapter;

import StructuralPatterns.AdapterPattern.Adaptee;
import StructuralPatterns.AdapterPattern.Target;

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        System.out.print("Adapter: ");
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.print("Adapter: ");
        System.out.println(adaptee.method3());
    }
}
