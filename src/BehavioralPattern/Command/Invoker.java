package BehavioralPattern.Command;
// 调用：让命令执行请求，
public class Invoker {
    private Command command;
    public void SetCommand(Command command){
        this.command=command;
    }
    public void ExecuteCommand(){
        command.Execute();
    }
}
