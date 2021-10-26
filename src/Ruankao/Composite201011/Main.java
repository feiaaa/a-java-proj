package Ruankao.Composite201011;
import java.util.*;
// 书上情景对话原代码
public class Main {
    public static void main(String args[]){
        ConcreteCompany root=new ConcreteCompany("beijing company");
        root.Add(new HRDepartment("bj hr"));
        root.Add(new FinanceDepartment("bj finance"));

        ConcreteCompany comp=new ConcreteCompany("shanghai company");
        comp.Add(new HRDepartment("sh hr"));
        comp.Add(new FinanceDepartment("sh finance"));
        root.Add(comp); //7

        ConcreteCompany comp1=new ConcreteCompany("nanjing company");
        comp1.Add(new HRDepartment("nj hr"));
        comp1.Add(new FinanceDepartment("nj finance"));
        comp.Add(comp1); //8
    }
}
