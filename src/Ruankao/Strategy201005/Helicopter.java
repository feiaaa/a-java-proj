package Ruankao.Strategy201005;

public class Helicopter extends Aircraft {
    public Helicopter(){
        flyBehavior =new SubSonicFly();
        takeOffBehavior=new VerticalTakeOff();
    }
}
