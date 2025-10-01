package my_package;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(
            int x1, int x2, int y1, int y2,
            int xSpeed, int ySpeed
    ){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString(){
        return "topLeft: " + topLeft.toString() + "bottomRight: " + bottomRight.toString();
    }

    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
    }

    @Override
    public void moveDown() {
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x += topLeft.xSpeed;;
    }

    @Override
    public void moveRight() {
        bottomRight.y += bottomRight.ySpeed;
    }
}
