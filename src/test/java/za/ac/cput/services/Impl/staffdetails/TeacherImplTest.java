/* TeacherImplTest.java
Testing for TeacherImplTest
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.services.Impl.staffdetails;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.admin.Admin;
import za.ac.cput.domain.staffdetails.Teacher;
import za.ac.cput.factory.admin.AdminFactory;
import za.ac.cput.factory.staffdetails.TeacherFactory;
import za.ac.cput.services.Interface.staffdetails.ITeacher;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TeacherImplTest {
    private Teacher teacher;

    @Autowired private ITeacher services;
    @BeforeEach
    void setUp() {
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        this.teacher = TeacherFactory.build(
                "36594",
                "Jimmy",
                "Beast",
                "039 359 1536",
                "Master degree",
                "None",
                "Government",
                admin);

        Teacher save = this.services.save(this.teacher);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.teacher, save)
        );
    }
    @Test
    @Order(1)
    void findAll() {
        List<Teacher> teacherList = this.services.findAll();
        System.out.println(teacherList);
        assertEquals(1,teacherList.size());
    }
    @Test
    @Order(2)
    void save() {
        Teacher save = this.services.save(this.teacher);
        System.out.println(save);
        assertNotNull(save);
    }
    @Test
    @Order(3)
    void read() {
        Optional<Teacher> read = this.services.read(this.teacher.getTeacherID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.teacher, read.get())
        );
    }
    @Test
    @Order(4)
    void delete() {
        Teacher delete = this.services.save(this.teacher);
        List<Teacher> teacherList = this.services.findAll();
        assertEquals(1,teacherList.size());
        System.out.println("Deleted");
        this.services.delete(delete);
    }
}
