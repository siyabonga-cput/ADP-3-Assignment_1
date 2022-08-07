/* ParentFactoryTest.java
Testing for ParentFactoryTest
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/
package za.ac.cput.factory.ParentDetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ParentDetails.Parent;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.StudentDetails.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

class ParentFactoryTest {
    @Test
    public void BuildWithSuccess() {
        Student student = StudentFactory.createStudent("Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        Parent parent = ParentFactory.createParent(student,
                "John",
                "Molten",
                "073 697 1537",
                "johnmolton12@gmail.com");
        assertNotNull(parent);
        System.out.println(parent);
    }

    @Test
    public void buildWithError() {
        Student student = StudentFactory.createStudent("Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        Parent parent = ParentFactory.createParent(student,
                "John",
                "Molten",
                "073 697 1537",
                "johnmolton12@gmail.com");
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ParentFactory.createParent(null,
                        "John",
                        "Molten",
                        "073 697 1537",
                        "johnmolton12@gmail.com"));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("staff ID is required!", exceptionMessage);
    }
}