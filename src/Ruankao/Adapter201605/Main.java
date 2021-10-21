package Ruankao.Adapter201605;
import java.util.*;

// 把dutch内容替换为address（adaptee）内容
public class Main {
    public static void main(String args[]){
        Address addr=new Address();
        DutchAddressAdapter addrAdapter=new DutchAddressAdapter(addr);//5
        System.out.println("== dutchAddress Adapter==");
        testDutch(addrAdapter);

    }
    static void testDutch(DutchAddress addr){
        addr.Straat();
        addr.PostCode();
        addr.Plaats();
    }
}
