package CreationalPatterns.FactoryMethodPattern.Factories;

import CreationalPatterns.FactoryMethodPattern.Products.ProductA;
import CreationalPatterns.FactoryMethodPattern.Products.ProductAa;
import CreationalPatterns.FactoryMethodPattern.Products.ProductB;
import CreationalPatterns.FactoryMethodPattern.Products.ProductBa;

public class aFactory implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        System.out.println("aFactory creating ProductAa");
        return new ProductAa();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("bFactory creating ProductBa");
        return new ProductBa();
    }
}
