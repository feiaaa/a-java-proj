package Ruankao.Singleton201411;

public class Main {
    public static void main(String[] args){
        Configure t=null;
        t=t.getInstance(); // 5
        t.SetConfigureData(1);
        int d= t.GetConfigureData();
        System.out.println(d);
    }
}
