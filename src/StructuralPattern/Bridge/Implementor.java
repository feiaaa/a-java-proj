package StructuralPattern.Bridge;
// 负责实现
abstract class Implementor {
    public abstract void Operation();
}

// 派生类A
class ConcreteImplementA extends Implementor{

    @Override
    public void Operation() {
        System.out.println("Method A execute");
    }
}

// 派生类B
class ConcreteImplementB extends Implementor{

    @Override
    public void Operation() {
        System.out.println("Method B execute");
    }
}
