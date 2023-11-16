package CreationalPatterns.FactoryMethodPattern;

import CreationalPatterns.FactoryMethodPattern.Factories.SimpleFactory;
import CreationalPatterns.FactoryMethodPattern.Products.ProductA;

/**
 * Client for simple factory
 */
public class Client1 {
    public static void main(String[] args) {
/*
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.createProduct("ProductA");
*/
        ProductA productA = SimpleFactory.createProduct("ProductAa");
        productA.method1();
        System.out.println(productA.getName());
    }
}
