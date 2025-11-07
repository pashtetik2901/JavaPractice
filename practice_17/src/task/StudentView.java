package task;

public class StudentView {
    public void printStudentDetail(String name, String rollNo) {
        String result = "rollNo: " + rollNo + "\n" + "Name: " + name;
        System.out.println(result);
    }
}
