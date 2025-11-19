import my_package.Animal;
import my_package.SecondTaskClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №2");
        Animal animal = new Animal();
        animal.name = "Bobik";
        SecondTaskClass<Integer, Animal, Boolean> cls = new SecondTaskClass<>(10, animal, true);
        System.out.println(cls.getTypes());
        System.out.println("\n--------------------\n");

        // Решение для первого и третьего лежат в пакете my_package
        // Решенеи для второго это расширение функционала второго класса
    }
}