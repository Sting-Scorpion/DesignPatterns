package CreationalPatterns.BuilderPattern;

public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public Product getResult(){
        System.out.println("--Builder has built a product");
        return product;
    }
}
