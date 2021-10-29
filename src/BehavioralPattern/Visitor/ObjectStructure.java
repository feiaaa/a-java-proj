package BehavioralPattern.Visitor;

import java.util.ArrayList;

// 能够枚举它的元素，提供一个高层次接口以允许访问它的元素
public class ObjectStructure {
    private ArrayList<Element> elements=new ArrayList<Element>();
    public void Attach(Element element){
        elements.add(element);
    }
    public void Detach(Element element){
        elements.remove(element);
    }
    public void Accept(Visitor visitor){
        for (Element e:elements) {
            e.Accept(visitor);

        }
    }
}
