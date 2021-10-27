package BehavioralPattern.Iterator;

import java.util.*;

/*
接口声明一个或多个方法来获取与集合兼容的迭代器。 请注意， 返回方法的类型必须被声明为迭代器接口， 因此具体集合可以返回各种不同种类的迭代器。
 */
public interface Aggregate<T> {
    public Iterator<T> CreateIterator();
}
// 具体聚集类
class ConcreteAggregate<T> implements Aggregate<T>{
    private List<T> items=new ArrayList<T>();

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator<T>(this);
    }
    public int Count(){
        return items.size();
    }
    public T getItems(int index){
        return items.get(index);
    }
    public void setItems(T item){
        items.add(item);
    }
}