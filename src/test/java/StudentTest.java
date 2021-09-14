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
}
