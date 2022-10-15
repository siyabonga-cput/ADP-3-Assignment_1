/* StudentImplTest.java
Testing for StudentImplTest
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/

package za.ac.cput.services.Impl.StudentDetails;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.StudentDetails.StudentFactory;
import za.ac.cput.services.Interface.StudentDetails.IStudent;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentImplTest {
    private Student student;
    @Autowired
    private IStudent service;
    @BeforeEach
    void setUp() {
        this.student = StudentFactory.Build(
                "2138532",
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        Student save = this.service.save(this.student);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.student, save)
        );
    }
    @Test
    @Order(1)
    void findAll() {
        List<Student> studentList = this.service.findAll();
        System.out.println(studentList);
        assertEquals(1,studentList.size());
    }
    @Test
    @Order(2)
    void save() {
        Student save = this.service.save(this.student);
        System.out.println(save);
        assertNotNull(save);
    }
    @Test
    @Order(3)
    void read() {
        Optional<Student> read = this.service.read(this.student.getStudentID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.student, read.get())
        );
    }
    @Test
    @Order(4)
    void delete() {
        Student delete = this.service.save(this.student);
        List<Student> studentList = this.service.findAll();
        assertEquals(1,studentList.size());
        System.out.println("Deleted!");
        this.service.delete(delete);
    }
}