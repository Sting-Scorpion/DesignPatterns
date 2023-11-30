package StructuralPatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlyweightFactory {
    private HashMap flyweights = new HashMap();

    public Flyweight getFlyweight(String key){
        if(flyweights.containsKey(key)){
            System.out.println("(Contains one)");
            return (Flyweight) flyweights.get(key);
        }
        else{
            System.out.println("(New One)");
            Flyweight fw = new ConcreteFlyweight(key);
            flyweights.put(key, fw);
            return fw;
        }
    }

    public void checkFlyweight(){
        int i = 0;
        System.out.println("-- [Check] --");
        for(Iterator it = flyweights.entrySet().iterator(); it.hasNext(); ){
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Item " + (++i) + ": " + e.getKey());
        }
        System.out.println("** [Check over] **");
    }
}
