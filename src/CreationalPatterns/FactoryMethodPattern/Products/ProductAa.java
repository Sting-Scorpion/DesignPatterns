package CreationalPatterns.FactoryMethodPattern.Products;

import CreationalPatterns.FactoryMethodPattern.Products.ProductA;

public class ProductAa implements ProductA {

    @Override
    public void method1() {
        System.out.println("ProductAa calling method1");
    }

    @Override
    public String getName() {
        return "ProductAa";
    }
}
