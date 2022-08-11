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
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.StaffDetails.TeacherFactory;
import za.ac.cput.factory.StudentDetails.StudentFactory;
import za.ac.cput.services.Interface.StaffDetails.ITeacher;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TeacherImplTest {
    private Student student;
    private Teacher teacher;

    @Autowired private ITeacher services;

    @BeforeEach
    void setUp() {
        this.student = StudentFactory.createStudent("Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        this.teacher = TeacherFactory.createTeacher(
                "Mike",
                "Ben",
                "085 564 3456",
                "Diploma in Maths",
                "None",
                "Maths Teacher",
                student);

        Teacher save = this.services.save(this.teacher);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.teacher, save)
        );
    }
    @Test
    void findAll() {
        List<Teacher> teacherList = this.services.findall();
        System.out.println(teacherList);
        assertEquals(1,teacherList.size());
    }
    @Test
    void save() {
        Teacher save = this.services.save(this.teacher);
        System.out.println(save);
        assertNotNull(save);
    }
    @Test
    void read() {
        Optional<Teacher> read = this.services.read(this.teacher.getTeacherID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.teacher, read.get())
        );
    }
    @Test
    void delete() {
        Teacher delete = this.services.save(this.teacher);
        List<Teacher> teacherList = this.services.findall();
        assertEquals(1,teacherList.size());
        System.out.println("Deleted!");
        this.services.delete(delete);
    }
}
