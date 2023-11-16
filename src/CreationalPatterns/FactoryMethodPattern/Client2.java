package CreationalPatterns.FactoryMethodPattern;

import CreationalPatterns.FactoryMethodPattern.Factories.Factory;
import CreationalPatterns.FactoryMethodPattern.Factories.FactoryA;
import CreationalPatterns.FactoryMethodPattern.Products.ProductA;

/**
 * Client for factory method
 */
public class Client2 {
    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryA();

        ProductA productA = factory.factory();
        productA.method1();
        System.out.println(productA.getName());
    }
}
