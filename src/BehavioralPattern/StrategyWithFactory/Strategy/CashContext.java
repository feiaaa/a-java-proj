package BehavioralPattern.StrategyWithFactory.Strategy;

public class CashContext {
    CashSuper cashSuper;


    public CashContext(int caseType){
        switch (caseType){
            case 1:
                cashSuper=new CashRebate();
                break;
            case 2:
                cashSuper=new CashNormal();
                break;
        }
    }

    public double GetResult(double moneyBefore){
        return cashSuper.getResult(moneyBefore);
    }

}
