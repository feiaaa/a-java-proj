package CreationalPattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts=new ArrayList<String>();
    public void Add(String part){
        parts.add(part);
    }
    public void Show(){
        System.out.println("===start create:===");
        for(String part : parts){ // for (string part in parts)
            System.out.println(part);
        }
    }

}
