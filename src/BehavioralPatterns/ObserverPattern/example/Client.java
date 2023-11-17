package BehavioralPatterns.ObserverPattern.example;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Cat("Tom");

         Observer obs1 = new Mouse("Jerry");
         Observer obs2 = new Dog("Doge");
         Observer obs3 = new Mouse("Ratta");

         subject.attach(obs1).attach(obs2).attach(obs3);

         subject.notifyObservers();

         subject.detach(obs3);
         subject.notifyObservers();

         subject.detach(obs2);
    }
}
