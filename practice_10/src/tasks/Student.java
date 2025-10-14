package tasks;

public class Student {
    private String name;
    private String surname;
    private String special;
    private int course;
    private String group;

    public Student(String name, String surname, String special, int course, String group) {
        this.name = name;
        this.surname = surname;
        this.special = special;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", special='" + special + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
