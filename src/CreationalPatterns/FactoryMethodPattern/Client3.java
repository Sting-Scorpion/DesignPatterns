package CreationalPatterns.FactoryMethodPattern;

import CreationalPatterns.FactoryMethodPattern.Factories.AbstractFactory;
import CreationalPatterns.FactoryMethodPattern.Factories.aFactory;
import CreationalPatterns.FactoryMethodPattern.Products.ProductA;
import CreationalPatterns.FactoryMethodPattern.Products.ProductB;

/**
 * Client for abstract factory method
 */
public class Client3 {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        abstractFactory = new aFactory();

        ProductA productA = abstractFactory.createProductA();
        ProductB productB = abstractFactory.createProductB();

        productA.method1();
        System.out.println(productA.getName());
        productB.method2();
    }
}
