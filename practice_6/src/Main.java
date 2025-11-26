import main.my_package.Movable;
import main.my_package.MovableCircle;
import main.my_package.MovablePoint;
import main.my_package.MovableRectangle;
import task_3.Dog;
import task_3.Nameable;
import task_3.People;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("-------------------");
        Movable m = new MovablePoint(10, 10, 5, 5);
        System.out.println(m.toString());
        m = new MovableCircle(10, 10, 5, 5, 20);
        System.out.println(m.toString());
        m.moveUp();
        m.moveRight();
        System.out.println(m.toString());

        System.out.println("Задание 2");
        System.out.println("--------------------");
        Movable new_m = new MovableRectangle(10, 5, 10, 5, 10, 10);
        System.out.println(new_m.toString());

        System.out.println("Задание 3");
        System.out.println("---------------------");
        Nameable people = new People("Test name");
        System.out.println("People: " + people.getName() + "\n");
        Nameable dog = new Dog("Test dog");
        System.out.println("Dog: " + dog.getName() + "\n");
    }
}