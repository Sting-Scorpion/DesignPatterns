package StructuralPatterns.ProxyPattern;

public class RealSubject extends Subject{
    public RealSubject() {
    }

    @Override
    public void request() {
        System.out.println("From real subject");
    }
}
