/*
FeesFactoryTest.java
Testing for FeesFactoryTest
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.Fees;
import static org.junit.jupiter.api.Assertions.*;

class FeesFactoryTest {
    @Test
    void createFees() {
        Fees fees = FeesFactory.createFees( 025345,
                351622789,
                985632, 1856.90 );
        assertNotNull(fees);
        System.out.println(fees);
    }
}
