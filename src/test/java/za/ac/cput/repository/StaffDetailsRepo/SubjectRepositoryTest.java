///* SubjectRepositoryTest.java
//Test the SubjectRepository
//Author: Jayden Johnson (219086796)
//Date: 6 April 2022
//*/
//package za.ac.cput.Repository.StaffDetailsRepo;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.Domain.StaffDetails.Subject;
//import za.ac.cput.Factory.StaffDetails.SubjectFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class SubjectRepositoryTest {
//    private static SubjectRepository repository = SubjectRepository.getRepository();
//    private static Subject subject = SubjectFactory.createSubject("2563"
//            ,"6954"
//            ,"Math"
//            ,52.06
//            ,76);
//
//    @Test
//    void a_create() {
//        Subject created = repository.create(subject);
//        assertEquals(subject.getSubjectID(), created.getSubjectID());
//        System.out.println("Create: " + created);
//    }
//
//    @Test
//    void b_read(){
//        Subject read = repository.read(subject.getSubjectID());
//        assertNotNull(read);
//        System.out.println("Read: " + read);
//    }
//
//    @Test
//    void c_update() {
//        Subject updated = new Subject.Builder().copy(subject)
//                .setSubjectID("9685")
//                .setSubDeptID("6597")
//                .setModules("English")
//                .setSubAverage(50.96)
//                .setStuAverage(70).build();
//        assertNotNull(repository.update(updated));
//        System.out.println("Updated: "+ updated);
//    }
//
//    @Test
//    void e_delete() {
//        boolean success = repository.delete(subject.getSubjectID());
//        assertTrue(success);
//        System.out.println("Deleted: " + success);
//
//    }
//
//    @Test
//    void d_getAll() {
//        System.out.println("Show all: ");
//        System.out.println(repository.getAll());
//    }
//}