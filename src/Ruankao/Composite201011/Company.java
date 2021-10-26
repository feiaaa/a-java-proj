package Ruankao.Composite201011;
import java.util.*;
abstract class Company { //1
    protected String name;
    public Company(String name){this.name=name;} //2
    public abstract void Add(Company c);
    public abstract void Delete(Company c);
}

class ConcreteCompany extends Company{
    private List<Company> children=new ArrayList<Company>(); //3,4


    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void Add(Company c) {
        children.add(c); //5
    }

    @Override
    public void Delete(Company c) {
        children.remove(c); // 6
    }

}
class HRDepartment extends Company{

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void Add(Company c) {
        System.out.println(this.name+"hr department add");
    }

    @Override
    public void Delete(Company c) {
        System.out.println(this.name+"hr department remove");

    }
}
class FinanceDepartment extends Company{

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void Add(Company c) {
        System.out.println(this.name+"finance department add");
    }

    @Override
    public void Delete(Company c) {
        System.out.println(this.name+"finance department remove");

    }
}