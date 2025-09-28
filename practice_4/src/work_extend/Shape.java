package work_extend;

public class Shape {
    public String getType(){
        return "Тип фигуры";
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return  0;
    }


    @Override
    public String toString() {
        return "Тип фигуры: " + getType()+ "\n" + "Площадь: " + getArea()+ "\n" + "Периметр: " + getPerimeter();
    }
}
