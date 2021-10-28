package BehavioralPattern.Command;
// 接受者:类包含部分业务逻辑。 几乎任何对象都可以作为接收者。 绝大部分命令只处理如何将请求传递到接收者的细节， 接收者自己会完成实际的工作。
public class Receiver {
    public void Action(){
        System.out.println("execute action!");
    }
}
