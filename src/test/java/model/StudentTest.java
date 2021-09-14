package model;

import model.Student;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StudentTest {
    @Test
    public void getNameTestWithConstructor() {
        // given
        Student student1 = new Student(25, "Lara Miller","Law");
        // when
        student1.setName("Laura Miller");
        String actual = student1.getName();
        // then
        Assertions.assertEquals("Laura Miller", actual);
    }


    @Test
    public void toStringTestWithConstructor() {
        // given
        Student student3 = new Student(2, "Mary Summer", "Medicine");
        String expected = "Student{id: 2; name: Mary Summer; subject: Medicine}";
        // when
        String actual = student3.toString();
        // then
        Assertions.assertEquals(expected, actual);
    }


}
