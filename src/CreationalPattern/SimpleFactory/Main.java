//import java.util.*;
package CreationalPattern.SimpleFactory;

public class Main {
    public static void main(String args[]){
        Operation operation;
        operation=OperationFactory.createOperate("+");
        operation.NumberA=1;
        operation.NumberB=2;
        double result=operation.GetResult();
        System.out.println(result);


    }
}
