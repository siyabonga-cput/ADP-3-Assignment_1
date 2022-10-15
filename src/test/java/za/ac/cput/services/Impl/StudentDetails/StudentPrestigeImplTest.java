/*  StudentPrestigeImplTest.java
    StudentPrestige services Tests
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
 */

package za.ac.cput.services.Impl.StudentDetails;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.StaffDetails.Subject;
import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.domain.StudentDetails.Culture;
import za.ac.cput.domain.StudentDetails.Sport;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.domain.StudentDetails.StudentPrestige;
import za.ac.cput.factory.Admin.AdminFactory;
import za.ac.cput.factory.StaffDetails.SubjectDepartmentFactory;
import za.ac.cput.factory.StaffDetails.SubjectFactory;
import za.ac.cput.factory.StaffDetails.TeacherFactory;
import za.ac.cput.factory.StudentDetails.CultureFactory;
import za.ac.cput.factory.StudentDetails.SportFactory;
import za.ac.cput.factory.StudentDetails.StudentFactory;
import za.ac.cput.factory.StudentDetails.StudentPrestigeFactory;
import za.ac.cput.services.Interface.StudentDetails.IStudentPrestige;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentPrestigeImplTest {
    private Student student;
    private Admin admin;
    private Teacher teacher;
    private Sport sport;
    private SubjectDepartment subjectDepartment;
    private Subject subject;
    private Culture culture;
    private StudentPrestige studentPrestige;

    @Autowired private IStudentPrestige service;

    @BeforeEach
    void setUp(){
        this.subjectDepartment = SubjectDepartmentFactory.Build(
                "219091498",
                "Mathematics");
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
        this.admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        this.teacher = TeacherFactory.build("365241",
                "John",
                "Zack",
                "Degree in maths",
                "Masters degree",
                "none",
                "Government",
                admin);
        this.sport = SportFactory.createSport(
                "05",
                student,
                teacher,
                "85");

        this.subject = SubjectFactory.build(
                "36259",
                "Math",
                56.30,
                65,
                subjectDepartment,
                student,
                teacher);
        this.culture= CultureFactory.build("01",
                "Dance",
                student);
        this.studentPrestige = StudentPrestigeFactory.build("01",
                "Certificate",
                student,
                sport,
                culture,
                subject);
        StudentPrestige save = this.service.save(this.studentPrestige);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.studentPrestige, save)
        );
    }

    @Test
    @Order(1)
    void findAll() {
        List<StudentPrestige> studentPrestigeList = this.service.findAll();
        System.out.println(studentPrestigeList);
        assertEquals(1,studentPrestigeList.size());
    }

    @Test
    @Order(2)
    void save() {
        StudentPrestige save = this.service.save(this.studentPrestige);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    @Order(3)
    void read() {
        Optional<StudentPrestige> read = this.service.read(this.studentPrestige.getPrestigeId());
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()-> assertEquals(this.studentPrestige, read.get())
        );
    }

    @Test
    @Order(4)
    void delete() {
        this.service.delete(this.studentPrestige);
    }
}