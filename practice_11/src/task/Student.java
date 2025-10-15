package task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student {
    String name;
    LocalDateTime birth;

    public Student(String name, LocalDateTime date){
        this.name = name;
        this.birth = date;
    }

    public String getDateOfBirth(String format){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String result = birth.format(formatter);
        return result;
    }
}
