package BehavioralPattern.Visitor;

abstract class Visitor {
    abstract public void VisitorConcreteElementA(ConcreteElementA concreteElementA);
    abstract public void VisitorConcreteElementB(ConcreteElementB concreteElementB);
}
class ConcreteVisitor1 extends Visitor{

    @Override
    public void VisitorConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }

    @Override
    public void VisitorConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }
}
class ConcreteVisitor2 extends Visitor{

    @Override
    public void VisitorConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }

    @Override
    public void VisitorConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }
}