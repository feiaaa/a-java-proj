package Ruankao.Decorator201611;

public class Invoice {
    public void printInvoice(){
        System.out.println("content of invoice");
    }
}
class Decorator extends Invoice{
    protected Invoice ticket;
    public Decorator(Invoice t){
        ticket=t;
    }
    public void printInvoice(){
        if(ticket!=null){
            ticket.printInvoice(); // 1
        }
    }
}
class HeadDecorator extends Decorator{
    public HeadDecorator(Invoice t) {
        super(t);
    }

    @Override
    public void printInvoice() {
        System.out.println("head of invoice");
        super.printInvoice(); // 2
    }
}
class FootDecorator extends Decorator{
    public FootDecorator(Invoice t) {
        super(t);
    }

    @Override
    public void printInvoice() {
        super.printInvoice(); // 3
        System.out.println("foot of invoice");
    }
}

