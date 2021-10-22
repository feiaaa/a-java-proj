package BehavioralPattern.Memento;
// 发起人，创建了备忘录，可以看和恢复备忘录
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public Memento CreateMemento(){
        return new Memento(this.state);
    }

    public void RecoverMemento(Memento memento){
        this.setState(memento.getState());
    }
    public void Show(){
        System.out.println("state:"+this.state);
    }
}
