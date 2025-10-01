import my_package.ModernString;
import my_package.WorkString;

public class Main{
    public static void main(String[] args) {
        WorkString new_string = new ModernString("Hello World");
        System.out.println("Количсетво символов: " + new_string.getCount('l') + "\n");
        System.out.println("Инвертированная строка: " + new_string.getInvert() + "\n");
        System.out.println("Строка из ченых индексов: " + new_string.getPosition() + "\n");
    }
}