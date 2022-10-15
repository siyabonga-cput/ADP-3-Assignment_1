/*
SupportStaffFactoryTest.java
Test for SupportStaffFactory
Author: Tiffany Kiwiets (219322732)
*/

package za.ac.cput.factory.StaffDetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.StaffDetails.SupportStaff;
import za.ac.cput.factory.Admin.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;

class SupportStaffFactoryTest {
    @Test
    public void BuildWithSuccess() {
        Admin admin = AdminFactory.createAdmin(
                "6325984",
                "48569 1266 75896");

        SupportStaff supportStaff = SupportStaffFactory.build(
                "635941258",
                "Julius",
                "Jacob",
                "08569112567",
                "Allegic to bees",
                "Degree in sport management",
                "Head of sports management",
                admin);
        assertNotNull(supportStaff);
        System.out.println(supportStaff);
    }

    @Test
    public void BuildWithError() {
        Admin admin = AdminFactory.createAdmin(
                "6325984",
                "48569 1266 75896");

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> SupportStaffFactory.build(
                null,
                "Julius",
                "Jacob",
                "08569112567",
                "Allegic to bees",
                "Degree in sport management",
                "Head of sports management",
                admin));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("ID is required!", exceptionMessage);

    }
}