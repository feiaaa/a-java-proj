package StructuralPattern.Bridge;
// 抽象类,负责抽象:提供高层控制逻辑， 依赖于完成底层实际工作的实现对象。
public class Abstraction{
    protected Implementor implementor;
    public void SetImplementor(Implementor implementor){
        this.implementor=implementor;
    }
    public void Operation(){
        implementor.Operation();
    }
}

// 精确对象:提供控制逻辑的变体。 与其父类一样， 它们通过通用实现接口与不同的实现进行交互。
class RefinedAbstraction extends Abstraction{
    @Override
    public void Operation(){
        implementor.Operation();
    }
}
