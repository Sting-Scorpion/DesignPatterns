package StructuralPatterns.AdapterPattern;

/**
 * 源类
 */
public class Adaptee {
    public void method1(){
        System.out.println("calling method1");
    }

    public String method3(){
        return "method3 of Adaptee";
    }
}
