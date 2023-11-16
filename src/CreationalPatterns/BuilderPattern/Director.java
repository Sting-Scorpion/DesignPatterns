package CreationalPatterns.BuilderPattern;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        System.out.println("-Director controls builder to construct:");
        builder.buildPartA();
        builder.buildPartB();
        return builder.getResult();
    }
}
