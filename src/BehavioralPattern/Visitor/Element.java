package BehavioralPattern.Visitor;

abstract class Element {
    abstract public void Accept(Visitor visitor);
}
class ConcreteElementA extends Element{

    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitorConcreteElementA(this);
    }
}
class ConcreteElementB extends Element{
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitorConcreteElementB(this);
    }
}
