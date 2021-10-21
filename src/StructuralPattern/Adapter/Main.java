package StructuralPattern.Adapter;
// java不支持多重继承， 目前只考虑对象适配器，不考虑类适配器
public class Main {
    public static void main(String args[]){
        Client client=new Adapter();
        client.Request();
    }
}
