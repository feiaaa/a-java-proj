package CreationalPattern.SimpleFactory;

public class OperationFactory{
    public static Operation createOperate(String operate){
        Operation oper=null;
        switch (operate){
            case "+":
                oper=new OperationAdd();
                break;
            case "-":
                oper=new OperationMinus();
                break;
            default:
                break;
        }
        return oper;
    }
}






