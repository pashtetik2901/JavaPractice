package practik_2;

public class Circle {
    private Point center;
    private double x;
    private double y;

    public Circle(double x, double y){
        this.x = x;
        this.y = y;
        this.center = new Point(x, y);
    }

    public Circle(Point center){
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
