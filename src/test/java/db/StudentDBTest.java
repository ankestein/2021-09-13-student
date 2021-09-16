package db;

import model.Student;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class StudentDBTest {



    @Test
    public void testList() {
        //GIVEN
        StudentDB studentDB = new StudentDB(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")
        ));

        //WHEN
        List<Student> actual = studentDB.list();

        //THEN
        List<Student> expected = new ArrayList<>(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")));
        assertEquals(expected, actual);
    }


    @Test
    public void testAdd() {
        //GIVEN
        StudentDB studentDB = new StudentDB(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")
        ));

        //WHEN
        studentDB.add(new Student(3, "Hannelore"));

        //THEN
        List<Student> expected = new ArrayList<>(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria"),
                new Student(3, "Hannelore")
        ));
        List<Student> actual = studentDB.list();
        assertEquals(expected, actual);

    }

    @Test
    public void testAddExistingStudentException() {
        //GIVEN
        StudentDB studentDB = new StudentDB(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")
        ));

        try {
            //WHEN
            studentDB.add(new Student(2, "Maria"));
            fail("Exception not thrown! A duplicate student could be added (or test data are flawed)"); // If code can run until this line, the Unit test will fail/won't work/will be red
        } catch (RuntimeException e) {
            String actual = e.getMessage();
            String expected = "Student already exists: id 2";
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testRemove() {
        //GIVEN
        StudentDB studentDB = new StudentDB(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")
        ));

        //WHEN
        studentDB.remove(2);

        //THEN
        List<Student> actual = studentDB.list();
        List<Student> expected = new ArrayList<>(List.of(
                new Student(1, "Paul")

        ));
        assertEquals(expected, actual);

    }


    @Test
    public void testFindById() {
        // given
        StudentDB studentDB = new StudentDB(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")
        ));
        Student student = new Student(2, "Maria");
        Optional<Student> expected = Optional.ofNullable(student);

        // when
        Optional<Student> actual = studentDB.findById(2);

        // then
        assertEquals(expected, actual);
    }


    @Test
    public void testFindByNonExistingId() {
        // given
        StudentDB studentDB = new StudentDB(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")
        ));
        Optional<Student> expected = Optional.empty();

        // when
        Optional<Student> actual = studentDB.findById(3);

        // then
        assertEquals(expected, actual);
    }


}
