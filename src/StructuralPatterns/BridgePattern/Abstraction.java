package StructuralPatterns.BridgePattern;

/* 维度二 */
public abstract class Abstraction {
    protected Implementor impl;

    public void setImpl(Implementor implementor){
        impl = implementor;
    }

    public abstract void operation();
}
