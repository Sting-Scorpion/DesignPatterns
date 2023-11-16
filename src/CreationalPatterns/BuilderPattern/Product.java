package CreationalPatterns.BuilderPattern;

public class Product {
    // 可以是任意类型
    private String a;
    private int b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
        System.out.println("---A has been set");
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
        System.out.println("---B has been set");
    }

    public void show(){
        System.out.println("----Show product----");
        System.out.println(a + b);
    }
}
