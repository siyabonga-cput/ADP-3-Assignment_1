/* TransportFactoryTest.java
   Factory Test class for Transport
   Author: Raeesah Williams (219091498)
   Date: 06 April 2022
*/
package za.ac.cput.factory.StudentDetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StudentDetails.Transport;
import static org.junit.jupiter.api.Assertions.*;

class TransportFactoryTest {
    @Test
    public void BuildWithSuccess()
    {
        Transport transport = TransportFactory.Build(
                "219091498",
                "Car");
        assertNotNull(transport);
        System.out.println(transport);
    }

    @Test
    public void BuildWithError()
    {
        Exception error = assertThrows(IllegalArgumentException.class, ()->
                TransportFactory.Build(
                        null,
                        "Car"));
        String ExceptionMessage = error.getMessage();
        System.out.println(error);
        assertSame("Type of transport is required", ExceptionMessage);
    }
}