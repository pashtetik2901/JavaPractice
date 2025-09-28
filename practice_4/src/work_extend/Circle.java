package work_extend;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.pow(radius, 2) * 3.14;
    }

    @Override
    public double getPerimeter(){
        return 2*3.14*radius;
    }

    @Override
    public String getType(){
        return "Круг";
    }
}
