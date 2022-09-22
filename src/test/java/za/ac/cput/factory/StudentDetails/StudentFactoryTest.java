/* StudentFactoryTest.java
Testing for StudentFactoryTest
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/
package za.ac.cput.factory.StudentDetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StudentDetails.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {
    @Test
    public void BuildWithSuccess() {
        Student student = StudentFactory.Build(
                "2138532",
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        assertNotNull(student);
        System.out.println(student);
    }

    @Test public void buildWithError() {
        Exception error = assertThrows(IllegalArgumentException.class, () ->
                StudentFactory.Build(
                        null,
                        "Jack",
                        "Molten",
                        12,
                        "5th January 1999",
                        3345,
                        "",
                        "None",
                        54.6));
        String ExceptionMessage = error.getMessage();
        System.out.println(error);
        assertSame("Student ID Required!", ExceptionMessage);
    }
}