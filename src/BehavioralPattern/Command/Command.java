package BehavioralPattern.Command;

// 声明执行操作的接口
abstract class Command {
    protected Receiver receiver;
    public Command(Receiver receiver){
        this.receiver=receiver;
    }
    public abstract void Execute();

}
class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void Execute() {
        receiver.Action();
    }
}
