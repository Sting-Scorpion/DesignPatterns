package CreationalPatterns.FactoryMethodPattern.Factories;

import CreationalPatterns.FactoryMethodPattern.Products.ProductA;
import CreationalPatterns.FactoryMethodPattern.Products.ProductAb;

public class FactoryB implements Factory {
    @Override
    public ProductA factory() {
        System.out.println("FactorB creating ProductAb");
        return new ProductAb();
    }
}
