package CreationalPatterns.FactoryMethodPattern.Factories;

import CreationalPatterns.FactoryMethodPattern.Products.ProductA;
import CreationalPatterns.FactoryMethodPattern.Products.ProductAa;

public class FactoryA implements Factory {

    @Override
    public ProductA factory() {
        System.out.println("FactorA creating ProductAa");
        return new ProductAa();
    }
}
