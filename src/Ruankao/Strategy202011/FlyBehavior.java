package Ruankao.Strategy202011;

interface FlyBehavior {
    public void fly();
}
class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不能飞！");
    }
}
class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("翅膀飞行！");
    }
}
