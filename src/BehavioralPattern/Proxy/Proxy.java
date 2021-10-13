package BehavioralPattern.Proxy;
interface Subject{
    void Request();
}
class RealSubject implements Subject{
    @Override
    public void Request(){
        System.out.println("real request");
    }

}
class Proxy implements Subject{
    RealSubject realSubject;
    @Override
    public void Request(){
        if(realSubject == null){
            realSubject =new RealSubject();
        }
        System.out.println("proxy request:");
        realSubject.Request();
    }
}
