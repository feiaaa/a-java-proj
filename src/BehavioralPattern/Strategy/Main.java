package BehavioralPattern.Strategy;


public class Main {
    public static void main(String args[]){
       double priceBefore=100.0;
        CashContext cashContext=new CashContext(new CashRebate());
        cashContext.contextInterface();
        double result=cashContext.GetResult(priceBefore);
        System.out.println(result);

    }
}
