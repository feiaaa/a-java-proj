package Ruankao.Template200811;
import java.util.Vector;
/* 题目要求
 * 打开文档的步骤
 * 1.检查文档是否能被打开，如不能，返回；
 * 2.创建文档对象
 * 3.通过文档对象打开文档
 * 4.通过文档对象读文档
 * 5.把文档对象加到Application的文档集合
 */

abstract class Application {
    private Vector<Document> docs; // 1 文档对象集合

    public boolean canOpenDocument(String docName){
        return true; // 打开-true;打不开-false;逻辑省略
    }
    public void addDocument(Document aDocument){
        docs.add(aDocument); // 2 文档对象加入文档
    }
    public abstract Document doCreateDocument(); // 创建对象
    public void openDocument(String docName){ // 打开文档
        if(!canOpenDocument(docName)){ // 3
            System.out.println("无法打开");
            return;
        }
        Document adoc=doCreateDocument(); // 4,5
        adoc.open(docName); // 6
        adoc.read(docName); // 7
        addDocument(adoc); // 8

    }

}


