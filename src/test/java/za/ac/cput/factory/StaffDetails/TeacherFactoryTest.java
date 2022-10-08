/* TeacherFactoryTest.java
Test the TeacherFactory
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.factory.StaffDetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.factory.Admin.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;

class TeacherFactoryTest {
    @Test
    public void BuildWithSuccess() {
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        Teacher teacher = TeacherFactory.build("365241",
                "John",
                "Zack",
                "Degree in maths",
                "Masters degree",
                "none",
                "Government",
                admin);
        assertNotNull(teacher);
        System.out.println(teacher);
    }

    @Test
    public void BuildWithError() {
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> TeacherFactory.build(
                null,
                "John",
                "Zack",
                "Degree in maths",
                "Masters degree",
                "none",
                "Government",
                admin));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Teacher ID is required!", exceptionMessage);
    }
}