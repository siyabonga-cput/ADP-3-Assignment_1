///* SubjectImplTest.java
//Testing for SubjectImplTest
//Author: Jayden Johnson (219086796)
//Date: 7 August 2022
//*/
//package za.ac.cput.services.Impl.StaffDetails;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import za.ac.cput.domain.StaffDetails.Subject;
//import za.ac.cput.domain.StaffDetails.SubjectDepartment;
//import za.ac.cput.domain.StaffDetails.Teacher;
//import za.ac.cput.domain.StudentDetails.Student;
//import za.ac.cput.factory.StaffDetails.SubjectDepartmentFactory;
//import za.ac.cput.factory.StaffDetails.SubjectFactory;
//import za.ac.cput.factory.StaffDetails.TeacherFactory;
//import za.ac.cput.factory.StudentDetails.StudentFactory;
//import za.ac.cput.services.Interface.StaffDetails.ISubject;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//class SubjectImplTest {
//    private Student student;
//    private Teacher teacher;
//    private SubjectDepartment subjectDepartment;
//    private Subject subject;
//    @Autowired
//    private ISubject service;
//    @BeforeEach
//    void setUp() {
//        this.student = StudentFactory.createStudent("Jack",
//                "Molten",
//                12,
//                "5th January 1999",
//                3345,
//                "14 Hope Street Cape Town",
//                "None",
//                54.6);
//        this.teacher = TeacherFactory.createTeacher(
//                "Mike",
//                "Ben",
//                "085 564 3456",
//                "Diploma in Maths",
//                "None",
//                "Maths Teacher",
//                student);
//        this.subjectDepartment = SubjectDepartmentFactory.createSubjectDepartment(teacher,
//                "Math");
//        this.subject = SubjectFactory.createSubject(
//                "Math",
//                subjectDepartment,
//                student,
//                78.34,
//                85.7);
//        Subject save = this.service.save(this.subject);
//        assertAll(
//                () -> assertNotNull(save),
//                () -> assertEquals(this.subject, save)
//        );
//    }
//    @Test
//    void findAll() {
//        List<Subject> subjectList = this.service.findall();
//        System.out.println(subjectList);
//        assertEquals(1,subjectList.size());
//    }
//    @Test
//    void save() {
//        Subject save = this.service.save(this.subject);
//        System.out.println(save);
//        assertNotNull(save);
//    }
//    @Test
//    void read() {
//        Optional<Subject> read = this.service.read(this.subject.getSubjectID());
//        System.out.println(read);
//        assertAll(
//                () -> assertTrue(read.isPresent()),
//                () -> assertEquals(this.subject, read.get())
//        );
//    }
//    @Test
//    void delete() {
//        Subject delete = this.service.save(this.subject);
//        List<Subject> subjectList = this.service.findall();
//        assertEquals(1,subjectList.size());
//        System.out.println("Deleted!");
//        this.service.delete(delete);
//    }
//
//}
