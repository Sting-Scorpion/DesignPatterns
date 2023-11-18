package StructuralPatterns.AdapterPattern;

public interface Target {
    /**
     * 源类也有的方法
     */
    void method1();

    /**
     * 源类没有的方法
     */
    void method2();
}
