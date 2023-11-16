package CreationalPatterns.BuilderPattern;

public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        System.out.println("--Building part A");
        product.setA("Set A: ");
    }

    @Override
    public void buildPartB() {
        System.out.println("--Building part B");
        product.setB(100);
    }
}
