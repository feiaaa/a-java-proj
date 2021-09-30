package BehavioralPattern.StrategyWithFactory.Strategy;

/*
 * Strategy combine with SimpleFactory
 * caseType:int;1-20% off;2-no discount
 * 和Strategy 相比，Main函数的CashContext作为工厂提取内容，
 *
 * ruankao 201511 https://zhuanlan.zhihu.com/p/271218782
 */
public class Main {
    public static void main(String args[]){
       double priceBefore=100.0;
       int caseType=2;

        CashContext cashContext=new CashContext(caseType);
        double result=cashContext.GetResult(priceBefore);
        System.out.println(result);

    }
}
