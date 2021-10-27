package BehavioralPattern.Iterator;

public interface Iterator<T> {
    // 头尾指针
    public T First();

    public T Next();

    public boolean IsDone();

    public T CurrentItem();

}
