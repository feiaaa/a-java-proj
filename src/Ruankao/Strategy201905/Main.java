package Ruankao.Strategy201905;
/*
 * 2019.05 https://www.educity.cn/rk/1976379.html
 * answer:https://zhuanlan.zhihu.com/p/271218782
 * longCar 省略
 */
public class Main {
    public static void main (String args[]){
        BreakBehavior brake=new ShortWheelBrake();
        ShortWheelCar car1=new ShortWheelCar(brake);
        car1.brake(); // 5
    }
}
