package work_extend;

public class Square extends Shape{
    private double a;
    private double b;

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType(){
        return "Квадрат";
    }

    @Override
    public double getArea(){
        return a*b;
    }

    @Override
    public double getPerimeter(){
        return 2*a + 2*b;
    }
}
