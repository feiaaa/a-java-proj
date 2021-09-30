package Ruankao.Strategy201905;

public class ShortWheelBrake implements BreakBehavior {
    @Override
    public void stop() {
        System.out.println("shortWheel Stop!");
    }
}
