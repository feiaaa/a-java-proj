package Ruankao.State201811;

public class FrequentFlyer {
    CState state;
    double flyMiles;

    public FrequentFlyer() {
        state = new CNoCustomer();
        flyMiles = 0;
        setState(state);
    }

    public void setState(CState state) {
        this.state = state;
    }
    public CState getState() {
        return state;
    }

    public void travel(int miles) {
        double bonusMiles = state.travel(miles, this);
        flyMiles = flyMiles + bonusMiles;
    }
}
