package StructuralPattern.Composite;


public class Leaf extends Component{
    public Leaf(String name){
        super(name);
    }

    @Override
    public void Add(Component c) {
        System.out.println("can not add to Leaf");
    }

    @Override
    public void Remove(Component c) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void Display(int depth) {
        System.out.println(depth+":" + this.name);
    }
}
