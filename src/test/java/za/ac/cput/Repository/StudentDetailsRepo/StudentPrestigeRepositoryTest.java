//package za.ac.cput.Repository.StudentDetailsRepo;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.Domain.StudentDetails.StudentPrestige;
//import za.ac.cput.Factory.StudentDetails.StudentPrestigeFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class StudentPrestigeRepositoryTest {
//    private static StudentPrestigeRepository repository = StudentPrestigeRepository.getRepository();
//    private static StudentPrestige studentPrestige = StudentPrestigeFactory.createStudentPrestige(1234,2,5,2,"First place Mathematics");
//
//
//    @Test
//    void a_create() {
//        StudentPrestige created = repository.create(studentPrestige);
//        assertEquals(studentPrestige.getPrestigeId(), created.getPrestigeId());
//        System.out.println("Created" + created);
//    }
//
//    @Test
//    void b_read() {
//        StudentPrestige read = repository.read(studentPrestige.getPrestigeId());
//        assertNotNull(read);
//        System.out.println("Read" + read);
//    }
//
//    @Test
//    void c_update() {
//        StudentPrestige updated = new StudentPrestige.Builder().copy(studentPrestige).setStudentId(2345)
//                .setAcademicId(7)
//                .setSportId(4)
//                .setCultureId(3)
//                .setPrestigeType("First Place English")
//                .build();
//        assertNotNull(repository.update(updated));
//        System.out.println("Updated" + updated);
//    }
//
//    @Test
//    void e_delete() {
//        boolean success = repository.delete(studentPrestige.getPrestigeId());
//        assertTrue(success);
//        System.out.println("Deleted" + success);
//    }
//
//    @Test
//    void d_getAll() {
//        System.out.println("Show All:");
//        System.out.println(repository.getAll());
//    }
//}