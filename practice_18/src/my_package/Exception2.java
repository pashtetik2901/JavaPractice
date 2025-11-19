package my_package;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer:");
            String str = scanner.next();
            int i = Integer.parseInt(str);
            System.out.println(2 / i);
        } catch (ArithmeticException err) {
            System.out.printf("You have error with: %s", err);
        } catch (Exception err) {
            System.out.printf("Ypu have error with: %s", err);
        } finally {
            System.out.println("Программа завершена");
        }
    }
}