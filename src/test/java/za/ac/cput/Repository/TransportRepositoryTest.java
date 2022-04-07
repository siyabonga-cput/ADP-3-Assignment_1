/* TransportRepositoryTest.java
   Repository Test class for Transport
   Author: Raeesah Williams (219091498)
   Date: 06 April 2022
*/

package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Domain.Entity.Transport;
import za.ac.cput.Factory.TransportFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TransportRepositoryTest
{
    private static TransportRepository repository = TransportRepository.getRepository();
    private static Transport transport = TransportFactory.createTransport
            ("385092845",
            "848499204",
            "Bus");

    @Test
    void a_create()
    {
        Transport created = repository.create(transport);
        assertEquals(transport.getTransportID(), created.getTransportID());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read()
    {
        Transport read = repository.read(transport.getTransportID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update()
    {
        Transport updated = new Transport.Builder().copy(transport)
                .setTransportID("9348")
                .setStudentID("4849")
                .setSuppStaffID("93757358")
                .setTypeOfTransport("Train")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete()
    {
        boolean success = repository.delete(transport.getTransportID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll()
    {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}