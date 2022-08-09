/* TeacherImplTest.java
Testing for TeacherImplTest
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.services.Impl.StaffDetails;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.factory.StaffDetails.TeacherFactory;
import za.ac.cput.services.Interface.StaffDetails.ITeacher;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TeacherImplTest {
    private Teacher teacher;
    @Autowired
    private ITeacher service;
    @BeforeEach
    void setUp() {
        this.teacher = TeacherFactory.createTeacher("Mike",
                "Mike",
                "2034861",
                "master",
                "Allergic to grapes",
                "Government");

        Teacher save = this.service.save(this.teacher);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.teacher, save)
        );
    }
    @Test
    void findAll() {
        List<Teacher> teacherList = this.service.findall();
        System.out.println(teacherList);
        assertEquals(1,teacherList.size());
    }
    @Test
    void save() {
        Teacher save = this.service.save(this.teacher);
        System.out.println(save);
        assertNotNull(save);
    }
    @Test
    void read() {
        Optional<Teacher> read = this.service.read(this.teacher.getTeacherID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.teacher, read.get())
        );
    }
    @Test
    void delete() {
        Teacher delete = this.service.save(this.teacher);
        List<Teacher> teacherList = this.service.findall();
        assertEquals(1,teacherList.size());
        System.out.println("Deleted!");
        this.service.delete(delete);
    }


}
