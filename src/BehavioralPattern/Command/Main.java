package BehavioralPattern.Command;

public class Main {
    public static void main(String[] args){
        Receiver r=new Receiver();
        Command c=new ConcreteCommand(r);
        Invoker i=new Invoker();
        i.SetCommand(c);
        i.ExecuteCommand();
    }
}
