package CreationalPattern.Singleton;

public class Main {
    public static void main(String[] args){
        Singleton s1=Singleton.GetInstance();
        Singleton s2=Singleton.GetInstance();
        System.out.println(s1==s2);
    }
}
