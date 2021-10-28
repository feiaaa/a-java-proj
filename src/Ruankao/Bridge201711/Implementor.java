package Ruankao.Bridge201711;

class Matrix{
    // ignored:各种格式文件转成矩阵
}
abstract public class Implementor {
    public abstract void doPaint(Matrix m);// 1 显示矩阵m
}
class WinImp extends Implementor{
    public void doPaint(Matrix m){
        // ignored:windows系统画矩阵
    }
}
class LinuxImp extends Implementor{
    public void doPaint(Matrix m){
        // ignored:linux系统画矩阵
    }
}
