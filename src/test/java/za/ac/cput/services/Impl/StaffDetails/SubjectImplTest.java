/* SubjectImplTest.java
Testing for SubjectImplTest
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.services.Impl.StaffDetails;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.StaffDetails.Subject;
import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.Admin.AdminFactory;
import za.ac.cput.factory.StaffDetails.SubjectDepartmentFactory;
import za.ac.cput.factory.StaffDetails.SubjectFactory;
import za.ac.cput.factory.StaffDetails.TeacherFactory;
import za.ac.cput.factory.StudentDetails.StudentFactory;
import za.ac.cput.services.Interface.StaffDetails.ISubject;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
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
        SubjectDepartment subjectDepartment = SubjectDepartmentFactory.createSubjectDepartment(
                teacher,
                "Pure Maths");
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
        List<Subject> subjectList = this.service.findall();
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
        List<Subject> subjectList = this.service.findall();
        assertEquals(1,subjectList.size());
        System.out.println("Deleted");
        this.service.delete(delete);
    }
}
