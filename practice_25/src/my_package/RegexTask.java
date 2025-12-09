package my_package;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask {

    // task 1
    public static String[] splitByRegex(String text, String regexDelimiter) {
        return text.split(regexDelimiter);
    }

    // task 2
    public static boolean chekString(String text) {
        Pattern STR = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        return STR.matcher(text).matches();
    }

    // task 3 Извлечение цены
    public static List<String> getPrice(String text) {
        Pattern PRICE = Pattern.compile("\\b\\d+(?:\\.\\d{2})?\\s(?:USD|RUB|EU)\\b");
        List<String> result = new ArrayList<>();
        Matcher m = PRICE.matcher(text);
        while (m.find()) {
            result.add(m.group());
        }
        return result;
    }

    // task 4 Цифры после которых нет +
    public static boolean getNumberWithoutPlus(String text) {
        Pattern NUMBER = Pattern.compile("\\d+(?!\\s*\\+)");
        return NUMBER.matcher(text).find();
    }

    // task 5 Дата
    public static boolean isValidDate(String text) {
        Pattern DATE_FORMATE = Pattern.compile("^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$");
        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy").withResolverStyle(ResolverStyle.STRICT);
        if (!DATE_FORMATE.matcher(text).matches()) return false;
        try {
            LocalDate.parse(text, FORMATTER);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // task 6 Проверка почты
    public static boolean isValidEmail(String text) {
        Pattern EMAIL = Pattern.compile("^(?:[A-Za-z0-9._%+-]+@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}|[A-Za-z0-9._%+-]+@localhost)$");
        return EMAIL.matcher(text).matches();
    }

    // task 7 Надежный пароль
    public static boolean isStrongPassword(String text) {
        Pattern PASSWORD = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9_]{8,}$");
        return PASSWORD.matcher(text).matches();
    }
}
