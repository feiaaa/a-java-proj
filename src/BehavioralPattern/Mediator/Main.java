package BehavioralPattern.Mediator;

public class Main {
    public static void main(String[] args){
        ConcreteMediator m=new ConcreteMediator();
        ConcreteColleague1 c1=new ConcreteColleague1(m);
        ConcreteColleague2 c2=new ConcreteColleague2(m);

        m.setC1(c1);
        m.setC2(c2);
        c1.sendMsg("吃饭了吗？");
        c2.sendMsg("没");

    }
}
