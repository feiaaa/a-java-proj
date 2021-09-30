package Ruankao.Strategy201005;

abstract class Aircraft
{
    protected FlyBehavior flyBehavior;
    protected TakeOffBehavior takeOffBehavior;
    public void fly(){
        flyBehavior.fly();
    }
    public void takeOff(){
        takeOffBehavior.takeOff();
    }
}
