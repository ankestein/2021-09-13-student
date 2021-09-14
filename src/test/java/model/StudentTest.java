package model;

import model.Student;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StudentTest {
    @Test
    public void getNameTest() {
        // given
        Student student1 = new Student();
        String student1Name = "Lara Miller";
        // when
        student1.setName(student1Name);
        String actual = student1.getName();
        // then
        Assertions.assertEquals(student1Name, actual);
    }

    @Test
    public void toStringTest() {
        // given
        Student student2 = new Student();
        student2.setId(1);
        student2.setName("Tim Jones");
        student2.setSubject("Physics");
        String expected = "Student{id: 1; name: Tim Jones; subject: Physics}";
        // when
        String actual = student2.toString();
        // then
        Assertions.assertEquals(expected, actual);
    }

}
