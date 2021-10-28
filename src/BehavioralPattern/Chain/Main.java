package BehavioralPattern.Chain;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Handler h1=new ConcreteHandler1();
        Handler h2=new ConcreteHandler2();
        Handler h3=new ConcreteHandler3();

        h1.SetSuccessor(h2);
        h2.SetSuccessor(h3);

        int[] requests = { 2, 14, 5, 6, 8, 23, 12, 21 };

        for (int request:requests) {
            h1.HandleRequest(request);
        }
    }
}
