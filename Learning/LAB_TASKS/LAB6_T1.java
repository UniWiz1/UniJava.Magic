package LAB_TASKS;

public class LAB6_T1 {
    public static void main(String[] args) {
        Circle circ = new Circle(2);
        Point p = new Point(10, 20);
        p.Print();
        circ.setLocation(10, 12);
        circ.Print();
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.Print();
        Shape shape = new Shape();
        shape.Print();
    }
}
class Point{
    private double x, y;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double getX(){
        return x;
    }
    void setX(double x){
        this.x = x;
    }
    double getY(){
        return y;
    }
    void setY(double y){
        this.y = y;
    }
    void Print(){
        System.out.printf("This is a point in 2-D space at (%.2f, %.2f)\n", getX(), getY());
    }
}
class Shape{
    public String color;
    public Point location;
    Shape(){
        color = "White";
        location = new Point(2,1);
    }
    Shape(String color){
        this.color = color;
    }
    double getX(){
        return location.getX();
    }
    double getY(){
        return location.getY();
    }
    void setLocation(double x, double y){
        location.setX(x);
        location.setY(y);
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    void Print(){
        System.out.printf("This is a %s shape at (%.2f, %.2f)\n", color, location.getX(), location.getY());
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void setCenter(double x, double y){
        setLocation(x, y);
    }
    Point getCenter(){
        return new Point(getX(), getY());
    }
    void Print(){
        System.out.printf("This is a %s circle at (%.2f, %.2f)\n", getColor(), getCenter().getX(), getCenter().getY());
    }
}
class Rectangle extends Shape{
    double width, height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    Point getCornerLeftLow(){
        return new Point(getX(), getY());
    }
    Point getCornerLeftUpp(){
        Point leftUpp = new Point(getX(), getY() + height);
        return leftUpp;
    }
    Point getCornerRightLow(){
        Point leftUpp = new Point(getX() + width, getY());
        return leftUpp;
    }
    Point getCornerRightUpp(){
        Point leftUpp = new Point(getX() + width, getY() + height);
        return leftUpp;
    }
    double getArea(){
        return width * height;
    }
    void Print(){
    System.out.printf("This is a %s rectangle at(%.2f, %.2f)\n",getColor(), getCornerLeftLow().getX(),getCornerLeftLow().getY());    }
}
