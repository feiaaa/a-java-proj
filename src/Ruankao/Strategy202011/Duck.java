package Ruankao.Strategy202011;

abstract class Duck {
    protected FlyBehavior flyBehavior; // 1
    protected QuackBehavior quackBehavior; // 2
    public void fly(){
        flyBehavior.fly(); // 3
    };
    public void quack(){
        quackBehavior.quack(); // 4
    };
    public abstract void display();
}
class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior =new FlyNoWay(); // 5
        quackBehavior =new Squeak();
    }

    @Override
    public void display() {
        // ignore
    }
}
