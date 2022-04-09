package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Domain.Entity.Admin;
import za.ac.cput.Factory.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;

//Siyabonga Tumelo Masango
//219200815
//31/03/2022
//sportFactory.java

    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
  public  class AdminRepositoryTest {
        private static AdminRepository repository = AdminRepository.getRepository();
       private static Admin admin = AdminFactory.createAdmin(
               "jds",
               "tom");
        @Order(1)
        @Test
        void create() {

            Admin created = repository.create(admin);
            assertEquals(created.getAdminID(),admin.getAdminID());
            System.out.println("Created: " + created);
        }
        @Order(2)
        @Test
        void read() {
            Admin read = repository.read(admin.getAdminID());
            //assertNotNull(read);
            System.out.println("Read: " + read);
        }
        @Order(3)
        @Test
        void update() {
            Admin update = new Admin.Builder().copy(admin).setAdminID("neo")
                    .setAdminID("neo")
                    .setBankingID("Jack")
                    .build();
            //assertEquals(update.getAdminID(),admin.getAdminID());
           // assertNotNull(repository.update(update));
            System.out.println("Update: " + update);
        }
        @Order(4)
        @Test
        void delete() {
            repository.delete(admin.getAdminID());
            assertNotNull(repository);
        }
        @Order(5)
        @Test
        void getAll() {
            System.out.println("show all: ");
            System.out.println(repository.getAll());
    }

    }