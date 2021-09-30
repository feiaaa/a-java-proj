package Ruankao.Strategy201005;

public interface FlyBehavior {
    public void fly();
}

class SubSonicFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("SubSonicFly!");
    }
}
class SuperSonicFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("SuperSonicFly!");
    }
}
