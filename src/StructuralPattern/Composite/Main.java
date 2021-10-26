package StructuralPattern.Composite;

public class Main {
    public static void main(String args[]){
        Composite root=new Composite("root");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));

        Composite comp=new Composite("x");
        comp.Add(new Leaf("Leaf XA"));
        comp.Add(new Leaf("Leaf XB"));
        root.Add(comp);
        root.Display(1);
    }
}
