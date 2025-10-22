import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void taskFirst() {
        String pattern = "^abcdefghijklmnopqrstuv18340$";
        String test_fail = "abcdefghijklmnoasdfasdpqrstuv18340";
        String test_right = "abcdefghijklmnopqrstuv18340";

        boolean isMatch = test_right.matches(pattern);

        String result = isMatch ? "Строка совпадет!" : "Строка не совпадает!";
        System.out.println(result);
    }

    public static void taskSecond() {
        String pattern = "\\b(0*(?:[1-9]\\d*|0?\\.\\d*[1-9])\\d*)\\s*(USD|RUB|EUR)\\b";
        String test_right = "0.3 USD";
        String test_fail = "0.23 EER";

        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(test_right);

        while (match.find()) {
            System.out.println("Цена: " + match.group(1) + " " + match.group(2));
        }
    }

    public static void taskThird() {
        String test_right = "(1+8)–9/4";
        String test_fail = "6/5–2*9";

        String patt = "\\d(?=\\+)";

        Pattern pattern = Pattern.compile(patt);

        // Проверим оба примера
        Matcher matcherRight = pattern.matcher(test_right);
        Matcher matcherFail = pattern.matcher(test_fail);

        if (matcherRight.find()) {
            System.out.println("test_right: В тексте есть цифры, после которых стоит '+'.");
        } else {
            System.out.println("test_right: В тексте нет цифр, после которых стоит '+'.");
        }

        if (matcherFail.find()) {
            System.out.println("test_fail: В тексте есть цифры, после которых стоит '+'.");
        } else {
            System.out.println("test_fail: В тексте нет цифр, после которых стоит '+'.");
        }
    }


    public static void main(String[] args) {
        System.out.println("Задание №2");
        taskFirst();
        System.out.println("\n--------------------\n");

        System.out.println("Задание №3");
        taskSecond();
        System.out.println("\n--------------------\n");

        System.out.println("Задание №4");
        taskThird();
        System.out.println("\n--------------------\n");
    }
}