package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.Teacher;
import static org.junit.jupiter.api.Assertions.*;

public class TeacherFactoryTest {

    @Test
    void createTeacher() {
        Teacher teacher = TeacherFactory.createTeacher("56456"
                ,"546"
                ,"Mike"
                ,"Jack"
                ,"0790365096"
                ,"Masters"
                ,"Asma"
                ,"Government");
        assertNotNull(teacher);
        System.out.println(teacher);
    }
}
