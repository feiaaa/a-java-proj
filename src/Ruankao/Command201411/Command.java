package Ruankao.Command201411;

interface Command { // 1
    public void execute();
}
class LightOnCommand implements Command{
    Light light;
    public LightOnCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();// 2
    }
}
class LightOffCommand implements Command{
    Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.off();// 3
    }
}
