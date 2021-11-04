package Ruankao.Visitor201505;

public interface LibraryItemInterface {
    void accept(LibraryVisitor visitor);// 3
}
class Article implements LibraryItemInterface{
    private String m_title;
    private String m_author;
    private int m_start_page;
    private int m_end_page;
    public Article(String p_author,String p_title,int p_start_page,int p_end_page){
        m_title=p_title;
        m_author=p_author;
        m_start_page=p_start_page;
        m_end_page=p_end_page;
    }
    public int getNumberOfPages(){
        return m_end_page-m_start_page;
    }
    public void accept(LibraryVisitor visitor){
        visitor.visit(this); //4
    }
}

class Book implements LibraryItemInterface{
    private String m_title;
    private String m_author;
    private int m_pages;

    public Book(String p_author,String p_title,int p_pages){
        m_title=p_title;
        m_author=p_author;
        m_pages=p_pages;
    }
    public int getNumberOfPages(){
        return m_pages;
    }
    public void accept(LibraryVisitor visitor){
        visitor.visit(this); //5
    }
}