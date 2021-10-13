package CreationalPattern.AbstractFactory;
/*
* ruankao 201211
* 抽象工厂：和简单工厂相比，不是直接去找具体的工厂名字，而是先找这个套系的大类，再让套系去找具体工厂
* */

public class Main {
    public static void main(String args[]){
        User user =new User();
        Department dept =new Department();
        IFactory factory=new AccessFactory();
        IUser iu =factory.CreateUser();
        iu.Insert(user);
        iu.GetUser(1);

        IDepartment idept=factory.CreateDepartment();
        idept.Insert(dept);
        idept.GetDepartment(1);

    }
}
