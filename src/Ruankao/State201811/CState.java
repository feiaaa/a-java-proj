package Ruankao.State201811;
import java.util.*;

abstract class CState {
    public int flyMiles;// 里程数
    public abstract double travel(int miles,FrequentFlyer context);// 1,// 根据里程数调整会员等级
}
// 非会员
class CNoCustomer extends CState{
    @Override
    public double travel(int miles,FrequentFlyer context){
        System.out.println("do not account for points");
        return miles;
    }
}
// 普卡会员
class CBasic extends CState{
    @Override
    public double travel(int miles,FrequentFlyer context){
        if(context.flyMiles >=25000 && context.flyMiles<50000){
            context.setState(new CSliver());// 2
        }
        if(context.flyMiles >50000){
            context.setState(new CGold()); // 3
        }

        return miles;
    }
}
// 银卡会员
class CSliver extends CState{
    @Override
    public double travel(int miles,FrequentFlyer context){
        if(context.flyMiles <=25000 ){
            context.setState(new CBasic());
        }
        if(context.flyMiles >50000){
            context.setState(new CGold());
        }

        return miles+0.25*miles;
    }
}
// 金卡会员
class CGold extends CState{
    @Override
    public double travel(int miles,FrequentFlyer context){
        if(context.flyMiles >=25000 && context.flyMiles<50000){
            context.setState(new CSliver()); // 4
        }
        if(context.flyMiles <=25000){
            context.setState(new CBasic()); // 5
        }

        return miles+0.5*miles;
    }
}
