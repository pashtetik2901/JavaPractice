import task_8.Polindrom;

public class Main{
    public static void main(String[] args) {
        System.out.println("Задание 8");
        System.out.println("--------------");
        String text = "Шалаш";
        Polindrom pol = new Polindrom(text);
        System.out.println("Прверяем слово " + text + ";\n" + "Результат: " + pol.isPolindrom());

        System.out.println("Задание 9");
        System.out.println("---------------");

    }
}