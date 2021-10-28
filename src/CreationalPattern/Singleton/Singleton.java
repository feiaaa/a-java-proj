package CreationalPattern.Singleton;
/*
本代码懒汉式，线程不安全
其他方式见 https://www.runoob.com/design-pattern/singleton-pattern.html
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){};
    public static Singleton GetInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
