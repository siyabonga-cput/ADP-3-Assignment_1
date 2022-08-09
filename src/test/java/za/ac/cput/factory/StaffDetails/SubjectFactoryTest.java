/* SubjectFactoryTest.java
Test the SubjectFactory
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/
package za.ac.cput.factory.StaffDetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StaffDetails.Subject;


import static org.junit.jupiter.api.Assertions.*;

class SubjectFactoryTest {
    @Test
    public void BuildWithSuccess() {
        Subject subject = SubjectFactory.createSubject("English"
                ,95.36
                ,36);
        assertNotNull(subject);
        System.out.println(subject);
    }

    @Test public void buildWithError() {
        Exception error = assertThrows(IllegalArgumentException.class, () ->
                SubjectFactory.createSubject(""
                        ,36
                        ,36));

        String ExceptionMessage = error.getMessage();
        System.out.println(error);
        assertSame("Module Required!", ExceptionMessage);
    }
}