import db.StudentDB;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Laura"));
        students.add(new Student(2, "Tim"));
        StudentDB studentsDB = new StudentDB(students);

        // try-catch for adding a single student
/*
        try {
            studentsDB.add(new Student(1, "Laura"));
        } catch (Exception e) {
            // System.out.println("Something went wrong");
            // System.out.println(e);
            // System.err.println(e);
            e.printStackTrace();
        }


        // try-catch for adding a list of students
*/
        List<Student> newStudents = new ArrayList<>();
        newStudents.add(new Student(3, "John"));
        newStudents.add(new Student(2, "Tim"));
        StudentDB newStudentsDB = new StudentDB(newStudents);


        try {
            studentsDB.add(newStudents);
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
        System.out.println(studentsDB);


    }
}
