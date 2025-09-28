package work_extend;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea(){
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2*a + 2*b;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }
}
