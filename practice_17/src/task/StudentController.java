package task;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentsName(String name) {
        model.setName(name);
    }

    public String getStudentsName() {
        return model.getName();
    }

    public void setStudentsRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentsRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printStudentDetail(model.getName(), model.getRollNo());
    }
}