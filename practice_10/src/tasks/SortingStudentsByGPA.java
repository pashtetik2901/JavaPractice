package tasks;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    private ArrayList<Student> iDNumber;

    public SortingStudentsByGPA(){
        this.iDNumber = new ArrayList<>();
    }

    public void setArray(Student student){
        iDNumber.add(student);
    }

    public ArrayList<Student> getArray(){
        return iDNumber;
    }

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
                right.add(s);
            } else {
                left.add(s);
            }
        }

        ArrayList<Student> result = new ArrayList<Student>();
        result.addAll(quickSort(left));
        result.addAll(medium);
        result.addAll(quickSort(right));

        return result;
    }

    public ArrayList<Student> mergeSort(ArrayList<Student> students){
        if(students.size() <= 1){
            return students;
        }

        int mid = students.size() / 2;
        ArrayList<Student> left = new ArrayList<>();
        ArrayList<Student> right = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            left.add(students.get(i));
        }
        for (int i = mid; i < students.size(); i++) {
            right.add(students.get(i));
        }

        left = mergeSort(left);
        right = mergeSort(right);

        int i = 0;
        int j = 0;

        while((i < left.size()) && (j < right.size())){
            if(left.get(i).getGpa() < right.get(j).getGpa()){
                students.set(i+j, left.get(i));
                i++;
            }
            else{
                students.set(i+j, right.get(j));
                j++;
            }
        }

        while(i < left.size()){
            students.set(i+j, left.get(i));
            i++;
        }
        while(j < right.size()){
            students.set(i+j, right.get(j));
            j++;
        }

        return students;
    }

    public void outArray(){
        for (Student st : iDNumber){
            System.out.println(st.toString());
        }
    }

    public ArrayList<Student> insertArray(ArrayList<Student> arr1, ArrayList<Student> arr2){
        ArrayList<Student> result = new ArrayList<>();
        result.addAll(arr1);
        result.addAll(arr2);

        result = quickSort(result);

        iDNumber = result;
        return result;
    }

}
