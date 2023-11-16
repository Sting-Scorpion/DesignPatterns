package CreationalPatterns.FactoryMethodPattern.Products;

import CreationalPatterns.FactoryMethodPattern.Products.ProductA;

public class ProductAb implements ProductA {
    @Override
    public void method1() {
        System.out.println("ProductAb calling method1");
    }

    @Override
    public String getName() {
        return "ProductAb";
    }
}
