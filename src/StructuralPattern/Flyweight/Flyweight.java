package StructuralPattern.Flyweight;

abstract class Flyweight {
    public abstract void Operation(int extrinsicState); //extrinsic 外在

}
class ConcreteFlyweight extends Flyweight{

    @Override
    public void Operation(int extrinsicState) {
        System.out.println("具体Flyweight："+extrinsicState);
    }
}

class UnSharedConcreteFlyweight extends Flyweight{

    @Override
    public void Operation(int extrinsicState) {
        System.out.println("不共享的具体Flyweight："+extrinsicState);
    }
}