package Ruankao.Bridge201311;

interface Drawing { // 1
    void drawLine(double x1,double y1,double x2,double y2); // 2
    void drawCircle(double x,double y,double r); // 3
}
class DP1{
    static public void draw_a_line(double x1,double y1,double x2,double y2)
    {
        System.out.println("DP1:draw_a_line");// ignored
    }
    static public void draw_a_circle(double x,double y,double r)
    {
        System.out.println("DP1:draw_a_circle");// ignored
    }
}
class DP2{
    static public void draw_a_line(double x1,double y1,double x2,double y2)
    {
        System.out.println("DP2:draw_a_line"+x1+","+y1+","+x2+","+y2);// ignored
    }
    static public void draw_a_circle(double x,double y,double r)
    {
        System.out.println("DP2:draw_a_circle"+x+","+y+","+r);// ignored
    }
}

class V1Drawing implements Drawing{

    @Override
    public void drawLine(double x1,double y1,double x2,double y2) {
        System.out.println("V1 Drawing:drawLine");
        DP1.draw_a_line(x1,y1,x2,y2);// 软考代码没有，本句自动脑补
    }

    @Override
    public void drawCircle(double x,double y,double r) {
        System.out.println("V1 Drawing:drawCircle");
        DP1.draw_a_circle(x,y,r); //4
    }
}
class V2Drawing implements Drawing{

    @Override
    public void drawLine(double x1,double y1,double x2,double y2) {
        System.out.println("V2 Drawing:drawLine");
        DP2.draw_a_line(x1,y1,x2,y2);// 软考代码没有，本句自动脑补
    }

    @Override
    public void drawCircle(double x,double y,double r) {
        System.out.println("V2 Drawing:drawCircle");
        DP2.draw_a_circle(x,y,r); //5
    }
}