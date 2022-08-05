package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Domain.Entity.Culture;
import za.ac.cput.Factory.CultureFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class CultureRepositoryTest {

    private static CultureRepository repository = CultureRepository.getRepository();
    private static Culture culture = CultureFactory.createCulture(2222,"Choir");

    @Test
    void a_create() {
        Culture created = repository.create(culture);
        assertEquals(culture.getCultureId(), created.getCultureId());
        System.out.println("Create" + created);
    }

    @Test
    void b_read() {
        Culture read = repository.read(culture.getCultureId());
        assertNotNull(read);
        System.out.println("Read" + read);
    }

    @Test
    void c_update() {
        Culture updated = new Culture.Builder().copy(culture).setStudentId(2345)
                .setCultureType("Drama")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(culture.getCultureId());
        assertTrue(success);
        System.out.println("Deleted" + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}