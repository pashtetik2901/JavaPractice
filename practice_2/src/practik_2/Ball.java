package practik_2;

public class Ball {
    private double x;
    private double y;

    public Ball(double x, double y) {
        this.y = y;
        this.x = x;
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

    public void move(double xDisp, double yDisp){
        this.x = x + xDisp;
        this.y = y + yDisp;
    }

    @Override
    public String toString(){
        return "Ball{\n" +
                "X = " + x + "\n" +
                "Y = " + x + "\n" +
                "};";
    }
}
