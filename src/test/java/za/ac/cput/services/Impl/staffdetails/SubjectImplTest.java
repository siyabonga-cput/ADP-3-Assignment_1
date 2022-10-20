/* SubjectImplTest.java
Testing for SubjectImplTest
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.services.Impl.staffdetails;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.admin.Admin;
import za.ac.cput.domain.staffdetails.Subject;
import za.ac.cput.domain.staffdetails.SubjectDepartment;
import za.ac.cput.domain.staffdetails.Teacher;
import za.ac.cput.domain.studentdetails.Student;
import za.ac.cput.factory.admin.AdminFactory;
import za.ac.cput.factory.staffdetails.SubjectDepartmentFactory;
import za.ac.cput.factory.staffdetails.SubjectFactory;
import za.ac.cput.factory.staffdetails.TeacherFactory;
import za.ac.cput.factory.studentdetails.StudentFactory;
import za.ac.cput.services.Interface.staffdetails.ISubject;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SubjectImplTest {
    private Subject subject;
    @Autowired
    private ISubject service;
    @BeforeEach
    void setUp() {
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");
        Teacher teacher = TeacherFactory.build(
                "36594",
                "Jimmy",
                "Beast",
                "039 359 1536",
                "Master degree",
                "None",
                "Government",
                admin);
        Student student = StudentFactory.Build(
                "2138532",
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        SubjectDepartment subjectDepartment = SubjectDepartmentFactory.Build(
                "219091498",
                "Mathematics");
        this.subject = SubjectFactory.build(
                "36259",
                "Math",
                56.30,
                65,
                subjectDepartment,
                student,
                teacher);

        Subject save = this.service.save(this.subject);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.subject, save)
        );
    }
    @Test
    @Order(1)
    void findAll() {
        List<Subject> subjectList = this.service.findAll();
        System.out.println(subjectList);
        assertEquals(1,subjectList.size());
    }
    @Test
    @Order(2)
    void save() {
        Subject save = this.service.save(this.subject);
        System.out.println(save);
        assertNotNull(save);
    }
    @Test
    @Order(3)
    void read() {
        Optional<Subject> read = this.service.read(this.subject.getSubjectID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.subject, read.get())
        );
    }
    @Test
    @Order(4)
    void delete() {
        Subject delete = this.service.save(this.subject);
        List<Subject> subjectList = this.service.findAll();
        assertEquals(1,subjectList.size());
        System.out.println("Deleted");
        this.service.delete(delete);
    }
}
