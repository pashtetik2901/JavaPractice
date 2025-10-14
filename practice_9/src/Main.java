import tasks.SortingStudentsByGPA;
import tasks.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        System.out.println("Задание №2");

        Student first = new Student("pasha", 5);
        Student second = new Student("fedor", 3);
        Student third = new Student("denis", 3.4);

        ArrayList<Student> arr = new ArrayList<>(Arrays.asList(first, second, third));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        ArrayList<Student> result = sorter.quickSort(arr);


        for(Student el : result){
            System.out.print(el.toString() + " ");
        }
    }
}