package CreationalPatterns.FactoryMethodPattern.Factories;

import CreationalPatterns.FactoryMethodPattern.Products.ProductA;
import CreationalPatterns.FactoryMethodPattern.Products.ProductB;

public interface AbstractFactory {
    public ProductA createProductA();
    public ProductB createProductB();
}
