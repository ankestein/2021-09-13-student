package db;

import model.Student;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    public void testAddException() {
        //GIVEN
        StudentDB studentDB = new StudentDB(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")
        ));

        try {
            //WHEN
            studentDB.add(new Student(2, "Maria"));
            fail();
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

}
