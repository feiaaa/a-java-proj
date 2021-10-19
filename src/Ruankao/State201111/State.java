package Ruankao.State201111;

public interface State {
    public void insertQuarter();// 投币
    public void quitQuarter();// 退币
    public void turnCrack();// 按下"取纸巾"按钮
    public void dispense();// 出纸
}

class TissueMachine{
    State soldOutState,noQuarterState,hasQuarterState,soldState;// 1
    State state=soldOutState;
    int count=0;// 纸巾数
    public TissueMachine(int numbers){
        // ignored

    }
    public State getHasQuarterState(){
        return hasQuarterState;
    }
    public State getNoQuarterState(){
        return noQuarterState;
    }
    public State getSoldState(){
        return soldState;
    }
    public State getSoldOutState(){
        return soldOutState;
    }
    public int getCount(){
        return count;
    }
    // other ignored
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return state;
    }

}
// 没投钱
class NoQuarterState implements State{
    TissueMachine tissueMachine;
    @Override
    public void insertQuarter() {
        tissueMachine.setState(tissueMachine.getHasQuarterState()); // 2
    }
    // ignored below
    @Override
    public void quitQuarter() {

    }

    @Override
    public void turnCrack() {

    }

    @Override
    public void dispense() {

    }
}

// 已投币
class HasQuarterState implements State{
    TissueMachine tissueMachine;
    public void ejectQuarter(){
        tissueMachine.setState(tissueMachine.getNoQuarterState());// 3
    }
    // ignored below
    @Override
    public void insertQuarter() {

    }

    @Override
    public void quitQuarter() {

    }

    @Override
    public void turnCrack() {

    }

    @Override
    public void dispense() {

    }
}

// 售出
class SoldState implements State{
    TissueMachine tissueMachine;
    @Override
    public void dispense() {
        // 出纸处理
        if(tissueMachine.getCount()>0){
            tissueMachine.setState(tissueMachine.getNoQuarterState());// 4 还有纸，回到售卖初始化
        }else{
            tissueMachine.setState(tissueMachine.getSoldOutState());// 5 没纸
        }
    }
    // ignored below
    @Override
    public void insertQuarter() {

    }

    @Override
    public void quitQuarter() {

    }

    @Override
    public void turnCrack() {

    }


}

// 售完
class SoldOutState implements State{
    TissueMachine tissueMachine;
    // ignored below
    @Override
    public void dispense() {

    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void quitQuarter() {

    }

    @Override
    public void turnCrack() {

    }


}