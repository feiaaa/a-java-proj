package Ruankao.Bridge201711;

/*
完整的可运行的代码见此 https://www.cnblogs.com/Archer-Fang/articles/10255203.html
 */
public class Main {
    public static void main(String[] args){
        // linux上看demo.gif文件
        Image image=new GIfImage(); // 3
        Implementor imageImp=new LinuxImp(); //4
        image.setImp(imageImp); // 5
        image.parseFile("demo.gif");
    }
}
