import my_package.RegexTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        String textForSplit = "яблоко, груша; банан|апельсин";
        String[] parts = RegexTask.splitByRegex(textForSplit, "[,;|]\\s*");
        System.out.println("Split: " + Arrays.toString(parts));
        System.out.println("----------------\n");

        System.out.println("Задача №2");
        System.out.println(RegexTask.chekString("abcdefghijklmnopqrstuv18340"));
        System.out.println(RegexTask.chekString("abcdefghijklmnoasdfasdpqrstuv18340"));
        System.out.println("----------------\n");

        System.out.println("Задача №3");
        String pricesText = "Цена товара 25.98 USD, доставка 120 RUB. 0.004 EU и 44 ERR.";
        System.out.println("Prices found: " + RegexTask.getPrice(pricesText));
        System.out.println("----------------\n");

        System.out.println("Задача №4");
        String okMath = "(1 + 8) – 9 / 4.";
        String badMath = "6 / 5 – 2 * 9.";
        System.out.println(RegexTask.getNumberWithoutPlus(okMath));
        System.out.println(RegexTask.getNumberWithoutPlus(badMath));
        System.out.println("----------------\n");

        System.out.println("Задача №5");
        System.out.println(RegexTask.isValidDate("29/02/2000"));
        System.out.println(RegexTask.isValidDate("29/02/2001"));
        System.out.println(RegexTask.isValidDate("30-04-2003"));
        System.out.println("----------------\n");

        System.out.println("Задача №6");
        System.out.println(RegexTask.isValidEmail("user@example.com"));
        System.out.println(RegexTask.isValidEmail("root@localhost"));
        System.out.println(RegexTask.isValidEmail("myhost@@@com.ru"));
        System.out.println("----------------\n");

        System.out.println("Задача №7");
        System.out.println(RegexTask.isStrongPassword("F032_Password"));
        System.out.println(RegexTask.isStrongPassword("TrySpy1."));
        System.out.println(RegexTask.isStrongPassword("smart_pass"));
        System.out.println(RegexTask.isStrongPassword("A007"));
    }
}