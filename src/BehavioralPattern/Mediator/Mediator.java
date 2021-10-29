package BehavioralPattern.Mediator;

abstract class Mediator {
    abstract public void Send(String message,Colleague colleague);
}
class ConcreteMediator extends Mediator{
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setC1(ConcreteColleague1 c1){
        this.colleague1=c1;
    }
    public ConcreteColleague1 getC1(){
        return colleague1;

    }
    public void setC2(ConcreteColleague2 c2){
        this.colleague2=c2;
    }
    public ConcreteColleague2 getC2(){
        return colleague2;

    }
    @Override
    public void Send(String message, Colleague colleague) {
        // 根据对象做出选择判断，通知对象
        if(colleague==colleague1){
            colleague1.notifyMsg(message);
        }else if(colleague==colleague2){
            colleague2.notifyMsg(message);
        }
    }
}