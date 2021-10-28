package StructuralPattern.Bridge;

public class Main {
    public static void main(String[] args){
        Abstraction ab=new RefinedAbstraction();
        ab.SetImplementor(new ConcreteImplementA());
        ab.Operation();

        ab.SetImplementor(new ConcreteImplementB());
        ab.Operation();
    }
}
