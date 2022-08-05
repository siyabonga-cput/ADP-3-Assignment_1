//package za.ac.cput.Repository.StudentDetailsRepo;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.Domain.StudentDetails.Sport;
//import za.ac.cput.Factory.StudentDetails.SportFactory;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
////Siyabonga Tumelo Masango
////219200815
////31/03/2022
////sportFactory.java
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class SportRepositoryTest {
//    private  static SportRepository repository = SportRepository.getRepository();
//    private static Sport sport = SportFactory.createSport(
//            "219208fsf",
//            "21994sd",
//            "80021lo",
//            "522s"
//    );
//    @Order(1)
//    @Test
//    void create() {
//
//        Sport created = repository.create(sport);
//        assertEquals(created.getSportID(),sport.getSportID());
//        System.out.println("Created: " + created);
//    }
//    @Order(2)
//    @Test
//    void read() {
//        Sport read = repository.read(sport.getSportID());
//        //assertNotNull(read);
//        System.out.println("Read: " + read);
//    }
//    @Order(3)
//    @Test
//    void update() {
//        Sport update = new Sport.Builder().copy(sport).setSportID("neo")
//                .setStudentID("neo")
//                .setTeacherID("Jack").setPerormanceScore("21662a")
//                .build();
//        //assertEquals(update.getAdminID(),admin.getAdminID());
//        // assertNotNull(repository.update(update));
//        System.out.println("Update: " + update);
//    }
//    @Order(4)
//    @Test
//    void delete() {
//        repository.delete(sport.getSportID());
//        assertNotNull(repository);
//    }
//
//    @Order(5)
//    @Test
//    void getAll() {
//        System.out.println("show all: ");
//        System.out.println(repository.getAll());
//    }
//}