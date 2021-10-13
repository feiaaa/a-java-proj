package Ruankao.Decorator201205;

public class Main {
    public static void main(String args[]){
        Beverage beverage=new DarkRoast();
        beverage =new Mocha(beverage);// 5
        beverage =new Whip(beverage);// 6
        System.out.println(beverage.getDescription()+"$"+beverage.cost());
    }
}
