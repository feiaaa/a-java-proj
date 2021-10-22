package BehavioralPattern.Memento;
// 备忘录，存储发起人内部状态，其他人不可访问
public class Memento {
    private String state;
    public Memento(String state){
        this.state=state;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
