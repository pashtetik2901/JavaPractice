import task_8.Combination;
import task_8.InvertNumber;
import task_8.Polindrom;

public class Main{
    public static void main(String[] args) {
        System.out.println("Задание 8");
        String text = "Шалаш";
        Polindrom pol = new Polindrom(text);
        System.out.println("Прверяем слово " + text + ";\n" + "Результат: " + pol.isPolindrom());
        System.out.println("--------------");

        System.out.println("Задание 9");
        Combination com = new Combination(2, 2);
        System.out.println("Ответ: " + com.countSequences(2, 2));
        System.out.println("---------------");

        System.out.println("Задание 10");
        int our_num = 234;
        InvertNumber number = new InvertNumber();
        System.out.println("Исходное число: " + our_num);
        System.out.println("Результат инвертирования: " + number.reverse(our_num));
        System.out.println("----------------");
    }
}