package Ruankao.Bridge201711;

abstract class Image {
    protected  Implementor imp;
    public void setImp(Implementor imp){
        this.imp=imp;
    }
    public abstract void parseFile(String fileName);
}
class BMPImage extends Image{

    @Override
    public void parseFile(String fileName) {
        // ignored
    }
}
class GIfImage extends Image{

    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();   // 解析BMP并获取矩阵对象m：软考代码没有，本句自动脑补
        imp.doPaint(m); // 显示像素矩阵M
        System.out.println(fileName+",is gif"); // 软考代码没有，本句自动脑补
    }
}