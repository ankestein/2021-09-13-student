package db;

import model.Student;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StudentDBTest {

    @Test
    public void listTest() {
        // given
        Student student1 = new Student(1, "Anna", "Law");
        Student student2 = new Student(2, "Tim", "Medicine");
        Student student3 = new Student(3, "Jenny", "Mathematics");
        Student[] students = {student1, student2, student3};
        StudentDB studentArray = new StudentDB(students);

        // when
        Student[] actual = studentArray.list();

        // then
        Assertions.assertArrayEquals(students, actual);

    }


    @Test
    public void toStringTest() {
        // given
        Student[] students = {
                new Student(1, "Anna", "Law"),
                new Student(2, "Tim", "Medicine"),
                new Student(3, "Jenny", "Mathematics")
        };
        StudentDB studentArray = new StudentDB(students);
        String expected = "StudentDB{students = [" +
                "Student{id: 1; name: Anna; subject: Law}, " +
                "Student{id: 2; name: Tim; subject: Medicine}, " +
                "Student{id: 3; name: Jenny; subject: Mathematics}" +
                "]}";

        // when
        String actual = studentArray.toString();

        // then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void addStudentTest() {
        // given
        Student[] students = {
                new Student(1, "Anna", "Law"),
                new Student(2, "Tim", "Medicine"),
                new Student(3, "Jenny", "Mathematics")
        };
        StudentDB studentArray = new StudentDB(students);
        // when
        studentArray.addStudent(new Student(4, "Luke", "Physics"));
        Student[] actual = studentArray.list();
        // then
        Assertions.assertArrayEquals(new Student[]{
                new Student(1, "Anna", "Law"),
                new Student(2, "Tim", "Medicine"),
                new Student(3, "Jenny", "Mathematics"),
                new Student(4, "Luke", "Physics")
        }, actual);
    }

}
