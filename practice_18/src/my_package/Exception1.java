package my_package;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException err) {
            System.out.println("ArithmeticException");
        }
    }
}
