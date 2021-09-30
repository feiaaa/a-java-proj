package Ruankao.Strategy201905;

public abstract class Car {
    protected BreakBehavior wheel; // 2
    public void brake(){
        wheel.stop(); // 3
    }
}
