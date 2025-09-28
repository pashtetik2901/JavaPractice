package practik_2;

public class Tester {
    private int size;
    private Circle []arr;

    public Tester(int size) {
        this.size = size;
        this.arr = new Circle[size];
    }

    public Tester(int size, Circle[] arr) {
        this.size = size;
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Circle[] getArr() {
        return arr;
    }

    public void setArr(Circle[] arr) {
        this.arr = arr;
    }
}
