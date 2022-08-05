//package za.ac.cput.Services.Impl.StudentDetails;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import za.ac.cput.Domain.StudentDetails.Student;
//import za.ac.cput.Factory.StudentDetails.StudentFactory;
//import za.ac.cput.Services.Interface.StudentDetails.IStudent;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class StudentImplTest {
//    private Student student;
//
//    @Autowired private IStudent service;
//
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
//        Student save = this.service.save(this.student);
//        assertAll(
//                () -> assertNotNull(save),
//                () -> assertEquals(this.student, save)
//        );
//    }
//    @Test
//    void findAll() {
//        List<Student> studentList = this.service.findall();
//        System.out.println(studentList);
//        assertEquals(1,studentList.size());
//    }
//
//    @Test
//    void save() {
//        Student save = this.service.save(this.student);
//        System.out.println(save);
//        assertNotNull(save);
//    }
//
//    @Test
//    void read() {
//        Optional<Student> read = this.service.read(this.student.getStudentID());
//        System.out.println(read);
//        assertAll(
//                () -> assertTrue(read.isPresent()),
//                () -> assertEquals(this.student, read.get())
//        );
//    }
//
//    @Test
//    void delete() {
//        Student delete = this.service.save(this.student);
//        List<Student> studentList = this.service.findall();
//        assertEquals(1,studentList.size());
//        this.service.delete(delete);
//    }
//}