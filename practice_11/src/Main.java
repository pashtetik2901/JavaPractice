import task.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void taskFirst(){
        String surname = "Test";
        LocalDate date_start = LocalDate.now();
        LocalDate date_end = LocalDate.of(2025, 10, 25);

        System.out.println("Задача поставлна для: " + surname + "\nСоздана: " + date_start + "\nВыполлнить до: " + date_end);
    }

    public static void compareDate(LocalDate date){
        LocalDate now = LocalDate.now();
        int result = now.compareTo(date);

        if(result < 0){
            System.out.println("Введенная дата еще не настала");
        }
        else if(result > 0){
            System.out.println("Введенная дата уже прошла");
        }
        else{
            System.out.println("Это сегодна");
        }
    }

    public static void taskThird(){
        Student student = new Student("Test", LocalDateTime.of(
                2007,
                1,
                29,
                11,
                30,
                0
        ));

        String format = "dd.MM.yyyy";

        System.out.println("Дата рождние студента: " + student.getDateOfBirth(format));
    }

    public static void taskFourth() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Год: ");
        int year = sc.nextInt();
        System.out.print("Месяц: ");
        int month = sc.nextInt();
        System.out.print("Число: ");
        int day = sc.nextInt();
        System.out.print("Часы: ");
        int hour = sc.nextInt();
        System.out.print("Минуты: ");
        int minute = sc.nextInt();

        Calendar cal = new GregorianCalendar(year, month - 1, day, hour, minute);
        Date date = cal.getTime();

        System.out.println("Созданная дата через Calendar: " + cal.getTime());
        System.out.println("Созданная дата через Date:     " + date);
    }

    public static void taskFifth() {
        int N = 3000;

        List<Integer> list1 = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list1.add(i);
        }
        long time1 = System.currentTimeMillis() - start;

        List<Integer> list2 = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list2.add(i);
        }
        long time2 = System.currentTimeMillis() - start;

        System.out.println("Добавление " + N + " элементов:");
        System.out.println("ArrayList: " + time1 + " мс");
        System.out.println("LinkedList: " + time2 + " мс");

        // --- Доступ по индексу (1000 раз) ---
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list1.get(N / 2);
        }
        time1 = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list2.get(N / 2);
        }
        time2 = System.currentTimeMillis() - start;

        System.out.println("Доступ по индексу:");
        System.out.println("ArrayList: " + time1 + " мс");
        System.out.println("LinkedList: " + time2 + " мс");

        start = System.currentTimeMillis();
        list1.contains(N - 1);
        time1 = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        list2.contains(N - 1);
        time2 = System.currentTimeMillis() - start;

        System.out.println("Поиск одного элемента:");
        System.out.println("ArrayList: " + time1 + " мс");
        System.out.println("LinkedList: " + time2 + " мс");
    }

    public static void main(String[] args) {
        System.out.println("Задание №1");
        taskFirst();
        System.out.println("\n---------------------\n");

        System.out.println("Задание №2");
        LocalDate our_date = LocalDate.of(2026, 12,31);
        compareDate(our_date);
        System.out.println("\n---------------------\n");

        System.out.println("Задание №3");
        taskThird();
        System.out.println("\n---------------------\n");

        System.out.println("Задание №4");
        taskFourth();
        System.out.println("\n----------------------\n");

        System.out.println("Задание №5");
        taskFifth();
        System.out.println("\n-----------------------\n");
    }
}