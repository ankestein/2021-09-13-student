package db;

import model.Student;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class StudentDBTest {

    @Test
    public void listTest() {
        // given
        Student student1 = new Student(1, "Anna", "Law");
        Student student2 = new Student(2, "Tim", "Medicine");
        Student student3 = new Student(3, "Jenny", "Mathematics");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentDB studentDB = new StudentDB(students);

        // when
        ArrayList<Student> actual = studentDB.list();

        // then
        Assertions.assertEquals(students, actual);

    }



    @Test
    public void toStringTest() {
        // given
        Student student1 = new Student(1, "Anna", "Law");
        Student student2 = new Student(2, "Tim", "Medicine");
        Student student3 = new Student(3, "Jenny", "Mathematics");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentDB studentDB = new StudentDB(students);

        String expected = "StudentDB{students = [Student{id: 1; name: Anna; subject: Law}, " +
                "Student{id: 2; name: Tim; subject: Medicine}, " +
                "Student{id: 3; name: Jenny; subject: Mathematics}]}";

        // when
        String actual = studentDB.toString();

        // then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void addStudentTest() {
        // given
        Student student1 = new Student(1, "Anna", "Law");
        Student student2 = new Student(2, "Tim", "Medicine");
        Student student3 = new Student(3, "Jenny", "Mathematics");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.addStudent(new Student(4, "Luke", "Physics"));
        ArrayList<Student> actual = studentDB.list();

        // then
        Assertions.assertEquals(new ArrayList<Student>(List.of(
                new Student(1, "Anna", "Law"),
                new Student(2, "Tim", "Medicine"),
                new Student(3, "Jenny", "Mathematics"),
                new Student(4, "Luke", "Physics")
        )), actual);
    }



}
