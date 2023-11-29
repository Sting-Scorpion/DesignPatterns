package StructuralPatterns.ProxyPattern;

public class ProxySubject extends Subject{
    private RealSubject rs;

    public ProxySubject() {
    }

    @Override
    public void request() {
        preRequest();
        if(rs == null){
            rs = new RealSubject();
        }
        rs.request();
        postRequest();
    }

    private void preRequest(){
        System.out.println("Proxy preRequest");
    }

    private void postRequest(){
        System.out.println("Proxy postRequest");
    }
}
