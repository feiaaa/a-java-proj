package BehavioralPattern.StrategyWithFactory.Strategy;

public class CashRebate extends CashSuper{

    @Override
    public double getResult(double moneyBefore) {
        return 0.8*moneyBefore;
    }
}
