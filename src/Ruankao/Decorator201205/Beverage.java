package Ruankao.Decorator201205;

public abstract class Beverage { // 1
    String description ="unknown beverage";

    public String getDescription() { // 2
        return description;
    }
    public abstract int cost(); // 3
}
class Expresso extends  Beverage{
    private final int Expresso_Price=25;
    public Expresso(){description="Expresso";}
    public int cost(){return Expresso_Price;}
}
class DarkRoast extends  Beverage{
    private final int DarkRoast_Price=20;
    public DarkRoast(){description="DarkRoast";}
    public int cost(){return DarkRoast_Price;}
}


abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage; // 4

}
class Mocha extends CondimentDecorator{
    private final int Mocha_Price=10;
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+",Mocha";
    }
    public int cost(){
        return Mocha_Price+ beverage.cost();
    }
}

class Whip extends CondimentDecorator{
    private final int Whip_Price=8;
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+",Whip";
    }
    public int cost(){
        return Whip_Price+ beverage.cost();
    }
}