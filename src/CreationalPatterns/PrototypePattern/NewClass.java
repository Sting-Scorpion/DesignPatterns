package CreationalPatterns.PrototypePattern;

import java.io.Serializable;

public class NewClass implements Serializable {
    String s;

    public NewClass(String s){
        this.s = s;
        System.out.println("a NewClass has been created");
    }

    public void setS(String s) {
        this.s = s;
    }

    public void show(){
        System.out.println("variable s = " + s);
    }
}
