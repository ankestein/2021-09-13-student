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

        try {
            studentsDB.add(new Student(1, "Laura"));
        } catch (RuntimeException e) {
            // System.out.println(e);
            // System.err.println(e);
            e.printStackTrace();
        }

        System.out.println(studentsDB);


    }
}
