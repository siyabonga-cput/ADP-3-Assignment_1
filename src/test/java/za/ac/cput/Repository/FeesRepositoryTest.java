/*
FeesRepositoryTest.java
Testing for FeesRepositoryTest
Author: Tiffany Kiwiets (219322732)
 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Domain.Entity.Fees;
import za.ac.cput.Factory.FeesFactory;
import org.junit.jupiter.api.MethodOrderer;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class FeesRepositoryTest {
    private static FeesRepository repository = FeesRepository.getRepository();
    private static Fees fees = FeesFactory.createFees( 4563,
            254966325,
            452369,
            1900.90 );

    @Test
    void a_create() {
        Fees created = repository.create(fees);
        assertEquals(fees.getFeeID(), created.getFeeID());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Fees read = repository.read(fees.getFeeID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Fees update = new Fees.Builder().copy(fees).setfeeID("123456")
                .setStudentID(956311459)
                .setAdminID(856321)
                .setParentID(756321563)
                .setAmount(1652.90)
                .build();
        assertNotNull(repository.update(update));
        System.out.println("Update: " + update);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(fees.getFeeID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}