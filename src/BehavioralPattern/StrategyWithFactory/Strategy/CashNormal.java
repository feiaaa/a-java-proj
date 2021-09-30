package BehavioralPattern.StrategyWithFactory.Strategy;

public class CashNormal extends CashSuper{

    @Override
    public double getResult(double moneyBefore) {
        return 0.8*moneyBefore;
    }
}
