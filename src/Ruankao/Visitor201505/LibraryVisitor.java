package Ruankao.Visitor201505;

interface LibraryVisitor {
    void visit(Book p_book);//1
    void visit(Article p_article);//2
    void printSum();
}
class LibraryPrintVisitor implements LibraryVisitor{
    private int sum=0;
    public void visit(Book p_book){
        sum=sum+p_book.getNumberOfPages();
    }
    public void visit(Article p_article){
        sum=sum+p_article.getNumberOfPages();
    }

    @Override
    public void printSum() {
        System.out.println("sum:"+sum);
    }
}
