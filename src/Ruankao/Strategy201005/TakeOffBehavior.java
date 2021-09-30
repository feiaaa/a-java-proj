package Ruankao.Strategy201005;

public interface TakeOffBehavior {
    public void takeOff();
}
class VerticalTakeOff implements TakeOffBehavior{
    @Override
    public void takeOff() {
        System.out.println("Vertical TakeOff！");
    }
}
class LongDistanceTakeOff implements TakeOffBehavior{
    @Override
    public void takeOff() {
        System.out.println("LongDistance TakeOff！");
    }
}
