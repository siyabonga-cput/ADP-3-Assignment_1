/* TransportFactoryTest.java
   Test class for Transport
   Author: Raeesah Williams (219091498)
   Date: 06 April 2022
*/
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.Transport;
import static org.junit.jupiter.api.Assertions.*;

public class TransportFactoryTest
{
    @Test
    void createTransport()
    {
        Transport transport = TransportFactory.createTransport(
                "3455",
                "859993058",
                "Car");
        assertNotNull(transport);
        System.out.println(transport);
    }
}
