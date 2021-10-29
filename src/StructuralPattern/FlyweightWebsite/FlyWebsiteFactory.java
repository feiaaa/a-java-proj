package StructuralPattern.FlyweightWebsite;

import java.util.HashMap;

public class FlyWebsiteFactory {
    private HashMap<String,Website> flyweights=new HashMap<String,Website>();
    // 获取分类
    public Website GetWebsiteCategory(String key){
        if(!flyweights.containsKey(key)){
            flyweights.put(key,new ConcreteWebsite(key));
        }
        return flyweights.get(key);
    }
    public int GetWebsiteCount(){
        return flyweights.size();
    }
}
