package StructuralPattern.Facade;

public class Facade {
    System1 one;
    System2 two;
    System3 three;
    System4 four;

    public Facade(){
        // 需要了解所有子系统的方法和属性，进行组合
        one=new System1();
        two=new System2();
        three=new System3();
        four=new System4();

    }
    // 方法套餐,可以自由组合子系统内的操作，而外部调用不必在意细节(具体是哪个系统的哪个方法)
    public void FacadeMethodA(){
        System.out.println("SetA");
        one.Method1();
        two.Method2();
        four.Method4();
    }
    public void FacadeMethodB(){
        System.out.println("SetB");
        two.Method2();
        three.Method3();
    }
}
