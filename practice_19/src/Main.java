import main.my_package.Order;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = sc.next();
        System.out.print("Введите фамилию: ");
        String surname = sc.next();
        System.out.print("Введите отчество: ");
        String father_name = sc.next();
        System.out.print("Введите ИНН: ");
        String inn = sc.next();

        order.startOrder(name, surname, father_name, inn);
    }
}