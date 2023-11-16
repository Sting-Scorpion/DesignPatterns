package CreationalPatterns.PrototypePattern;

public interface Prototype extends Cloneable{
    void show();

    void setNc(NewClass c);

    NewClass getNc();

    void setNCs(String s);
    Object clone() throws CloneNotSupportedException;
}
