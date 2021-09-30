package CreationalPattern.SimpleFactory;

public class Operation{
    public double NumberA=0;
    public double NumberB=0;

    public  double GetResult(){
        double result =0;
        return result;
    }
}


class OperationAdd extends Operation{
    public  double GetResult(){
        double result =0;
        result=NumberA+NumberB;
        return result;
    }
}

class OperationMinus extends Operation{
    public  double GetResult(){
        double result =0;
        result=NumberA-NumberB;
        return result;
    }
}
