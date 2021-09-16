import db.StudentDB;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String args[]){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Laura"));
        students.add(new Student(2, "Tim"));

        StudentDB studentsDB = new StudentDB(students);
        studentsDB.add(new Student(1, "Laura"));

        System.out.println(studentsDB);

    }
}
