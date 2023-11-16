package CreationalPatterns.PrototypePattern.example;

import java.io.Serializable;

public class GoldRingedStaff implements Cloneable, Serializable {
    private float height = 100.0F;
    private float diameter = 10.0F;

    public GoldRingedStaff() {
        System.out.println("获得金箍棒");
    }

    public void grow(){
        height *= 2;
        diameter *= 2;
    }

    public void shrink(){
        height /= 2;
        diameter /= 2;
    }

    public void hit(){
        System.out.println("金箍棒攻击");
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
}
