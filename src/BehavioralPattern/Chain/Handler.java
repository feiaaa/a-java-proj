package BehavioralPattern.Chain;
// 定义处理接口
abstract class Handler {
    protected Handler successor;
    public void SetSuccessor(Handler successor){
        this.successor=successor;
    }
    public abstract void HandleRequest(int request);
}
// 具体处理类
class ConcreteHandler1 extends Handler{

    @Override
    public void HandleRequest(int request) {
        if(request>=0 && request<10){
            System.out.println("handle request1"+this.getClass().getName()+request);// this.getClass().getName() java自带
        }else if(successor!=null){
            successor.HandleRequest(request);
        }

    }
}
class ConcreteHandler2 extends Handler{

    @Override
    public void HandleRequest(int request) {
        if(request>=10 && request<20){
            System.out.println("handle request2"+this.getClass().getName()+request);// this.getClass().getName() java自带
        }else if(successor!=null){
            successor.HandleRequest(request);
        }

    }
}
class ConcreteHandler3 extends Handler{

    @Override
    public void HandleRequest(int request) {
        if(request>=20 && request<30){
            System.out.println("handle request2"+this.getClass().getName()+request);// this.getClass().getName() java自带
        }else if(successor!=null){
            successor.HandleRequest(request);
        }

    }
}
