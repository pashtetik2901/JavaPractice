import tasks.SortingStudentsByGPA;
import tasks.Student;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1, №2");
        Student first = new Student(
                "pasha",
                "test",
                5,
                "IIT",
                2,
                "RPGD-00-00"
        );

        Student second = new Student(
                "jo",
                "test",
                3.4,
                "IIT",
                2,
                "RPGD-00-00"
        );

        Student third = new Student(
                "test",
                "test",
                2,
                "IIT",
                2,
                "RPGD-00-00"
        );

        Student fourth = new Student(
                "test",
                "test",
                1.2,
                "IIT",
                2,
                "RPGD-00-00"
        );


        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(first);
        sorter.setArray(second);
        sorter.setArray(third);

        ArrayList<Student> result = sorter.quickSort(sorter.getArray());

        sorter.outArray();

        System.out.println("\n-------------------------\n");
        System.out.println("Задание №3");

        ArrayList<Student> arr1 = new ArrayList<>(Arrays.asList(first, second));
        ArrayList<Student> arr2 = new ArrayList<>(Arrays.asList(third, fourth));

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.insertArray(arr1, arr2);

        sort.outArray();

    }
}