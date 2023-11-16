package CreationalPatterns.PrototypePattern.example;

import java.io.*;
import java.util.Date;

public class Monkey implements Cloneable, Serializable{
    private int weight;
    private int height;
    private Date birthDate;
    private GoldRingedStaff staff;

    public Monkey(){
        System.out.println("大圣出世");
        birthDate = new Date();
        staff = new GoldRingedStaff();
    }

    public Object deepClone()
            throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bo);
        oos.writeObject(this);
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bi);
        return (ois.readObject());
    }

    @Override
    public Object clone(){
        Monkey temp = null;
        try{
            temp = (Monkey) super.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("Clone failed");
        }finally {
            return temp;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public GoldRingedStaff getStaff() {
        return staff;
    }
}
