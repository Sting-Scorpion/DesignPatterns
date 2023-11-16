package CreationalPatterns.PrototypePattern;

import CreationalPatterns.PrototypePattern.NewClass;
import CreationalPatterns.PrototypePattern.Prototype;

import java.io.Serializable;

public class ConcretePrototype implements Prototype, Serializable {
    NewClass nc;

    @Override
    public void setNc(NewClass nc) {
        this.nc = nc;
    }

    @Override
    public NewClass getNc() {
        return nc;
    }

    @Override
    public void setNCs(String s) {
        nc.setS(s);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Prototype be cloned");
        return super.clone();
    }

    public void show(){
        nc.show();
    }
}
