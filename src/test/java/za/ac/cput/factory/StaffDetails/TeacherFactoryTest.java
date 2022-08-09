/* TeacherFactoryTest.java
Test the TeacherFactory
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.factory.StaffDetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StaffDetails.Teacher;

import static org.junit.jupiter.api.Assertions.*;

class TeacherFactoryTest {
    @Test
    public void BuildWithSuccess() {
        Teacher teacher = TeacherFactory.createTeacher("mike"
                ,"mike"
                ,"456813"
                ,"Jack"
                ,"Allergic to grapes"
                ,"Government");
        assertNotNull(teacher);
        System.out.println(teacher);
    }

    @Test public void buildWithError() {
        Exception error = assertThrows(IllegalArgumentException.class, () ->
                TeacherFactory.createTeacher("mike"
                        ,"mike"
                        ,"456813"
                        ,"Jack"
                        ,"Allergic to grapes"
                        ,""));
        String ExceptionMessage = error.getMessage();
        System.out.println(error);
        assertSame("Post Required!", ExceptionMessage);
    }
}