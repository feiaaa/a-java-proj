package BehavioralPattern.Strategy;
public class CashRebate implements Strategy {


    @Override
    public void algorithmInterface() {
        System.out.println("CashRebate");
    }

    @Override
    public double getResult(double moneyBefore) {
        return 0.8*moneyBefore;
    }
}
