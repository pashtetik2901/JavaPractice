import task_8.Combination;
import task_8.InvertNumber;
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
        Combination com = new Combination(2, 2);
        System.out.println(com.ways());
        System.out.println(com.countSequences(2, 2));


        System.out.println("Задание 10");
        System.out.println("----------------");
        int our_num = 234;
        InvertNumber number = new InvertNumber(our_num);
        System.out.println("Исходное число: " + our_num);
        System.out.println("Результат инвертирования: " + number.invert());

    }
}