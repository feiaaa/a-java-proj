package CreationalPattern.Builder;

public class Main {
    public static void main(String args[]){
        Director director =new Director();
        Builder b1=new ConcreteBuilder1();
        Builder b2=new ConcreteBuilder2();

        director.construct(b1);
        Product p1=b1.GetResult();
        p1.Show();

        director.construct(b2);
        Product p2=b2.GetResult();
        p2.Show();

    }
}
