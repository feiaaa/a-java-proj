package Ruankao.Bridge201311;
// 完整的可运行代码 https://segmentfault.com/a/1190000007448292
public class Main {
    public static void main(String[] args){
        //
        V1Drawing v1=new V1Drawing();
        V2Drawing v2=new V2Drawing();
        Rectangle r1=new Rectangle(v1,1.0,2.0,3.0,4.0);
        r1.draw();
        v2.drawCircle(2.1, 4.5, 5.6);
        v2.drawLine(2.4, 3.3 ,4.2, 5.1);
    }
}
