import task_1.Complex;
import task_1.ConcreteFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        ConcreteFactory factory = new ConcreteFactory();
        Complex number = factory.createComplex();
        Complex number2 = factory.CreateComplex(10, 10);
        System.out.println(number2.toString());
        System.out.println(number.toString());
        System.out.println("\n--------------------------\n");

        System.out.println("Задание №2");
        System.out.println("Материалы в пакете task_2");
        System.out.println("\n--------------------------\n");

        System.out.println("Задание №3");

        System.out.println("\n--------------------------\n");
    }
}