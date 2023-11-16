package CreationalPatterns.FactoryMethodPattern.Factories;

import CreationalPatterns.FactoryMethodPattern.Products.ProductA;
import CreationalPatterns.FactoryMethodPattern.Products.ProductAb;
import CreationalPatterns.FactoryMethodPattern.Products.ProductB;
import CreationalPatterns.FactoryMethodPattern.Products.ProductBb;

public class bFactory implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        System.out.println("bFactory creating ProductAb");
        return new ProductAb();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("bFactory creating ProductBb");
        return new ProductBb();
    }
}
