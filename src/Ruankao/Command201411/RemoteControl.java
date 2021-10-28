package Ruankao.Command201411;
// 遥控器-Receiver
public class RemoteControl {
    Command[] onCommands=new Command[7];
    Command[] offCommands=new Command[7];
    public RemoteControl(){
        // ignored
    }
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;// 4
        offCommands[slot]=offCommand;// 5
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();//6
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();//7
    }
}

