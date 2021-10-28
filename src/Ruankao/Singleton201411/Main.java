package Ruankao.Singleton201411;

public class Main {
    public static void main(String[] args){
        Configure t=null;
        t=t.getInstance(); // 5

        t.SetConfigureData(1);
        int d= t.GetConfigureData();
        System.out.println(d);
        // 下面这段为检测代码。如果t2和t1不是同一个实例，则获取到的data不同
        Configure t2=Configure.getInstance();
        System.out.println(t2.GetConfigureData());

    }
}
