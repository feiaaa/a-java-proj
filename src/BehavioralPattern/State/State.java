package BehavioralPattern.State;

public abstract class State {
    public abstract void Handle(Context context);

}
class ConcreteStateA extends State{

    @Override
    public void Handle(Context context) {
        System.out.println("now StateA,ready to B");
        context.setState(new ConcreteStateB());

    }
}
class ConcreteStateB extends State{

    @Override
    public void Handle(Context context) {
        System.out.println("now StateB,ready to A");
        context.setState(new ConcreteStateA());

    }
}