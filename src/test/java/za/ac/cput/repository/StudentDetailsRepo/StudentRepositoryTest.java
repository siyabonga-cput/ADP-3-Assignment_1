///* StudentRepositoryTest.java
//Testing for StudentRepositoryTest
//Author: Marvin Peter Hope (219445842)
//Date: 4 April 2022
//*/
//package za.ac.cput.Repository.StudentDetailsRepo;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.Domain.StudentDetails.Student;
//import za.ac.cput.Factory.StudentDetails.StudentFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class StudentRepositoryTest {
//    private static StudentRepository repository = StudentRepository.getRepository();
//    private static Student student = StudentFactory.createStudent(01234,
//            3456,
//            "Peter",
//            "Parker",
//            10,
//            "10 May 2003",
//            034567123002,
//            "10 Hope Street Cape Town",
//            "Healthy",
//            88.6);
//
//    @Test
//    void a_create() {
//        Student created = repository.create(student);
//        assertEquals(student.getStudentID(),created.getStudentID());
//        System.out.println("Created: " + created);
//    }
//    @Test
//    void b_read() {
//        Student read = repository.read(student.getStudentID());
//        assertNotNull(read);
//        System.out.println("Read: " + read);
//    }
//
//    @Test
//    void c_update() {
//        Student update = new Student.Builder().copy(student)
//                .setStudentID("872345")
//                .setParentID(32145)
//                .setAdminID(654785)
//                .setStuName("Marvin")
//                .setStuSurname("Hope")
//                .setGrade(12)
//                .setDob("6 October 1999")
//                .setIdNumber(990078594)
//                .setAddress("10 Long Street Cape Town")
//                .setImportantHealthInfo("Healthy")
//                .setStuAverage(89.6)
//                .build();
//        assertNotNull(repository.update(update));
//        System.out.println("Updated: " + update);
//
//    }
//
//    @Test
//    void e_delete() {
//        boolean success = repository.delete(student.getStudentID());
//        assertTrue(success);
//        System.out.println("Deleted: " + success);
//    }
//
//    @Test
//    void d_getAll() {
//        System.out.println("Show all: ");
//        System.out.println(repository.getAll());
//    }
//
//}