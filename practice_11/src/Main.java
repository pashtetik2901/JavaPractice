import task.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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
    }
}