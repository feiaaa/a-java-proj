package BehavioralPattern.Strategy;

public class CashContext {
    Strategy strategy;

    public CashContext(Strategy strategy){
        this.strategy=strategy;
    }
    public void contextInterface() {
        strategy.algorithmInterface();
    }
    public double GetResult(double moneyBefore){
        return strategy.getResult(moneyBefore);
    }

}
