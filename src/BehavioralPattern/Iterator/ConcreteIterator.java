package BehavioralPattern.Iterator;
import java.util.*;

class ConcreteIterator<T> implements Iterator<T>{
    private ConcreteAggregate<T> aggregate;
    private int current=0;
    public ConcreteIterator(ConcreteAggregate<T> aggregate){
        this.setConcreteAggregate(aggregate);

    }
    @Override
    public T First() {
        return aggregate.getItems(0);
    }

    @Override
    public T Next() {

        current++;
        if(current< aggregate.Count()){
            return aggregate.getItems(current);
        }
        return null;
    }

    @Override
    public boolean IsDone() {
        return current >= aggregate.Count()? true:false;
    }

    @Override
    public T CurrentItem() {
        return aggregate.getItems(current);
    }

    public ConcreteAggregate<T> getConcreteAggregate(){
        return aggregate;
    }
    public void setConcreteAggregate(ConcreteAggregate<T> aggregate){
        this.aggregate=aggregate;
    }
    public int getCurrent() {
        return current;
    }
    public void setCurrent(int current){
        this.current=current;
    }
}

