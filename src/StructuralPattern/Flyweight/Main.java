package StructuralPattern.Flyweight;

public class Main {
    public static void main(String[] args){
        int extrinsicState=22;
        FlyweightFactory ff=new FlyweightFactory();
        Flyweight fx= ff.getFlyweight("x");
        fx.Operation(--extrinsicState);

        Flyweight fy=ff.getFlyweight("y");
        fy.Operation(--extrinsicState);

        Flyweight fz=ff.getFlyweight("z");
        fz.Operation(--extrinsicState);

        UnSharedConcreteFlyweight uf=new UnSharedConcreteFlyweight();
        uf.Operation(--extrinsicState);
    }
}
