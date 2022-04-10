/*
SupportStaffFactoryTest.java
Testing for SupportStaffTest
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.SupportStaff;
import static org.junit.jupiter.api.Assertions.*;

class SupportStaffFactoryTest {
    @Test
    void createSupportStaff() {
        SupportStaff supportStaff = SupportStaffFactory.createSupportStaff( 635941258,
                "Julius",
                "Jacob",
                02153354567,
                "Allegic to bees", "Degree in sport management",
                "Head of sports management");
        assertNotNull(supportStaff);
        System.out.println(supportStaff);
}
}