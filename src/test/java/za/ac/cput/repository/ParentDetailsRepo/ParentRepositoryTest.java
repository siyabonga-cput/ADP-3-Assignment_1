///* ParentRepositoryTest.java
//Testing for ParentRepositoryTest
//Author: Marvin Peter Hope (219445842)
//Date: 4 April 2022
//*/
//package za.ac.cput.Repository.ParentDetailsRepo;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.Domain.ParentDetails.Parent;
//import za.ac.cput.Factory.ParentDetails.ParentFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class ParentRepositoryTest {
//    private static ParentRepository repository = ParentRepository.getRepository();
//    private static Parent parent = ParentFactory.createParent(01234,
//            "John",
//            "Wick",
//            "0874567231",
//            "johnwick007@gmail.com");
//
//    @Test
//    void a_create() {
//        Parent created = repository.create(parent);
//        assertEquals(parent.getParentID(),created.getParentID());
//        System.out.println("Created: " + created);
//    }
//    @Test
//    void b_read() {
//        Parent read = repository.read(parent.getParentID());
//        assertNotNull(read);
//        System.out.println("Read: " + read);
//    }
//
//    @Test
//    void c_update() {
//        Parent update = new Parent.Builder().copy(parent).setParentID("098674")
//                .setStudentID(0054577)
//                .setParName("Jack")
//                .setParSurname("Dawson")
//                .setCellNumber("0723456785")
//                .setEmail("jackdawson99@gmial.com")
//                .build();
//        assertNotNull(repository.update(update));
//        System.out.println("Update: " + update);
//    }
//    @Test
//    void e_delete() {
//        boolean success = repository.delete(parent.getParentID());
//        assertTrue(success);
//        System.out.println("Deleted: " + success);
//    }
//
//    @Test
//    void d_getAll() {
//        System.out.println("show all: ");
//        System.out.println(repository.getAll());
//    }
//}