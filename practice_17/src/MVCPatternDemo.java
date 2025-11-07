import task.Student;
import task.StudentController;
import task.StudentView;

public class MVCPatternDemo {
    public static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("TestName");
        student.setRollNo("TestRollNo");
        return student;
    }

    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentsName("Test_2_Name");
        controller.setStudentsRollNo("Test_2_RollNo");
        controller.updateView();
    }
}