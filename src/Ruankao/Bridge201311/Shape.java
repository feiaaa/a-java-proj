package Ruankao.Bridge201311;

abstract class Shape {
    private Drawing _dp;
    public abstract void draw(); // 6
    Shape(Drawing dp){
        _dp=dp;
    }
    public void drawLine(double x1,double y1,double x2,double y2){
        _dp.drawLine(x1, y1, x2, y2);
    }
    public void drawCircle(double x,double y,double r){
        _dp.drawCircle(x, y, r);

    }
}
class Circle extends Shape{
    private double _x,_y,_r;
    public Circle(Drawing dp,double x,double y,double r){
        super(dp); //
    };
    @Override
    public void draw() {
        drawCircle(_x,_y,_r);
    }
}
class Rectangle extends Shape{
    private double _x1,_x2,_y1,_y2;
    public Rectangle(Drawing dp,double x1,double y1,double x2,double y2){
        super(dp);
    };
    @Override
    public void draw() {
        drawLine(_x1,_y1,_x2,_y2);
    }
}