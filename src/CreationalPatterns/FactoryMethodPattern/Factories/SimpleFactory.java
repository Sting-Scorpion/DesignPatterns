package CreationalPatterns.FactoryMethodPattern.Factories;

import CreationalPatterns.FactoryMethodPattern.Products.ProductA;
import CreationalPatterns.FactoryMethodPattern.Products.ProductAa;
import CreationalPatterns.FactoryMethodPattern.Products.ProductAb;

/**
 * 简单工厂
 */
public class SimpleFactory {
    public static ProductA createProduct(String type){
        if(type.equals("ProductAa")){
            return new ProductAa();
        }
        else if(type.equals("ProductAb")){
            return new ProductAb();
        }
        else{
            throw new RuntimeException("wrong product");
        }
    }
}
