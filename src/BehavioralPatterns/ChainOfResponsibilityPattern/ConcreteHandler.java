package BehavioralPatterns.ChainOfResponsibilityPattern;

public class ConcreteHandler extends Handler{
    @Override
    public void handleRequest(String request) {
        if(getSuccessor() == null){
            System.out.println("Handle request: [ " + request + " ]");
        }
        else{
            System.out.println("Forward request");
            getSuccessor().handleRequest(request);
        }
    }
}
