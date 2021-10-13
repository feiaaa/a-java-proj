package StructuralPattern.Decorator;
public class Main {
    public static void main(String[] args){
        Person xc=new Person("xc");
        TShirt tShirt=new TShirt();
        Trousers trousers=new Trousers();

        tShirt.Decorate(xc);
        trousers.Decorate(tShirt);
        trousers.Show();

    }
}
