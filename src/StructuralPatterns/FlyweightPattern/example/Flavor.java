package StructuralPatterns.FlyweightPattern.example;

public class Flavor implements Order{
    private String flavor;

    public Flavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serve(Table table) {
        System.out.println("-- [Serving table " + table.getNumber() + " with flavor: " + flavor + "] --");
    }

    @Override
    public String getFlavor() {
        return flavor;
    }
}
