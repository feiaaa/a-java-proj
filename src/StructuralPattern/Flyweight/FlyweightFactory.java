package StructuralPattern.Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String,Flyweight> flyweights=new HashMap<String, Flyweight>();
    public Flyweight getFlyweight(String key){
        if(!flyweights.containsKey(key)){
            flyweights.put(key,new ConcreteFlyweight());
        }
        return flyweights.get(key);
    }
}
