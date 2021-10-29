package BehavioralPattern.Interpreter;
// 解释器以外的全局信息
public class Context {
    private String input;
    public String getInput(){
        return input;
    };
    public void setInput(String input){
        this.input=input;
    }


    private String output;
    public String getOutput(){
        return output;
    };
    public void setOutput(String output){
        this.output=output;
    }
}
