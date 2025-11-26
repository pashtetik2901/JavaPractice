import main.my_package.Exception1;
import main.my_package.Exception2;
import main.my_package.ThrowsDemo;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        Exception1 exc = new Exception1();
        exc.exceptionDemo();
        System.out.println("\n-------------------\n");

        System.out.println("Задание №2, 3, 4");
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
        System.out.println("\n-------------------\n");

        System.out.println("Задание №5");
        ThrowsDemo exception3 = new ThrowsDemo();
        exception3.getDetails(null);
        System.out.println("\n--------------------\n");

        System.out.println("Задание №6,7,8");
        ThrowsDemo exception4 = new ThrowsDemo();
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        exception4.getDetails(null);
        System.out.println("\n--------------------\n");
    }
}