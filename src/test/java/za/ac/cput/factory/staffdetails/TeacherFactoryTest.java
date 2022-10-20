/* TeacherFactoryTest.java
Test the TeacherFactory
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.factory.staffdetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.admin.Admin;
import za.ac.cput.domain.staffdetails.Teacher;
import za.ac.cput.factory.admin.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;

class TeacherFactoryTest {
    @Test
    public void BuildWithSuccess() {
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        Teacher teacher = TeacherFactory.build("36594",
                "Jimmy",
                "Beast",
                "039 359 1536",
                "Master degree",
                "None",
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
                        "Jimmy",
                        "Beast",
                        "039 359 1536",
                        "Master degree",
                        "None",
                        "Government",
                        admin));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Teacher ID is required!", exceptionMessage);
    }
}