package BehavioralPattern.Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        ConcreteAggregate<String> bus =new ConcreteAggregate<String>();
        bus.setItems("大鸟");
        bus.setItems("小菜");
        bus.setItems("行李");
        bus.setItems("老外");
        bus.setItems("公交内部员工");

        ConcreteIterator<String> iterator=new ConcreteIterator<String>(bus);
//        Iterator<String> iterator=new ConcreteIterator<String>(bus); // 书上代码， 输入这个，报错；考试以书上为准
        while (!iterator.IsDone()){
            System.out.println(iterator.CurrentItem() + "请买票！");
            iterator.Next();
        }
    }
}
