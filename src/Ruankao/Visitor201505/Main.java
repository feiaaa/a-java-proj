package Ruankao.Visitor201505;

public class Main {
    public static void main(String[] args){
        // 试题没有，本段系自动脑补
        Book book=new Book("book author","book title",100);
        Article article=new Article("article author","article_title",20,30);
        LibraryPrintVisitor libraryPrintVisitor=new LibraryPrintVisitor();
        libraryPrintVisitor.visit(book);
        libraryPrintVisitor.visit(article);
        libraryPrintVisitor.printSum();
    }
}
