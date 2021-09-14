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



    @Test
    public void testEqualsYes() {
        // given
        Student studentA = new Student(55, "Leon", "Medicine");
        Student studentB = new Student(55, "Leon", "Medicine");
        // when
        boolean actual = studentA.equals(studentB);
        // then
        Assertions.assertTrue(actual);
        // Assertions.assertEquals(true, actual); // alternative, but assertTrue is more straightforward
    }

    @Test
    public void testEqualsNo() {
        // given
        Student studentC = new Student(234, "Lara", "Medicine");
        Student studentD = new Student(7, "Lara", "Medicine");
        // when
        boolean actual = studentC.equals(studentD);
        // then
        Assertions.assertFalse(actual);
        // Assertions.assertEquals(false, actual);
    }


}
