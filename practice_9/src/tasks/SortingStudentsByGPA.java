package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public SortingStudentsByGPA(){}

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }

    public ArrayList<Student> quickSort(ArrayList<Student> arr){
        if(arr.size() <= 1){
            return arr;
        }

        Student pivot = arr.get(arr.size() / 2);

        ArrayList<Student> left = new ArrayList<>();
        ArrayList<Student> right = new ArrayList<>();
        ArrayList<Student> medium = new ArrayList<>();

        for(Student s : arr) {
            int buf = compare(s, pivot);
            if (buf == 0) {
                medium.add(s);
            } else if (buf < 0) {
                left.add(s);
            } else {
                right.add(s);
            }
        }

        ArrayList<Student> result = new ArrayList<Student>();
        result.addAll(quickSort(left));
        result.addAll(medium);
        result.addAll(quickSort(right));

        return result;
    }

}
