package Ruankao.Decorator201611;

// 注意输出结果套娃

public class Main {
    public static void main(String args[]){
        Invoice t =new Invoice();
        Invoice ticket;
        ticket=new FootDecorator(new HeadDecorator(t)); // 4
        ticket.printInvoice();
        System.out.println("______");

        ticket=new FootDecorator(new HeadDecorator(null)); // 5
        ticket.printInvoice();
    }
}
