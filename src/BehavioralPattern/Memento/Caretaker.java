package BehavioralPattern.Memento;
// 持有者，保存好备忘录，但不能操作，检查
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
