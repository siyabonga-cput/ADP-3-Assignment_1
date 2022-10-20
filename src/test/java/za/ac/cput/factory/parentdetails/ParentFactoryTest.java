/* ParentFactoryTest.java
Testing for ParentFactoryTest
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/
package za.ac.cput.factory.parentdetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.parentdetails.Parent;
import za.ac.cput.domain.studentdetails.Student;
import za.ac.cput.factory.studentdetails.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

class ParentFactoryTest {
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
        Parent parent = ParentFactory.build(
                "2343544",
                "John",
                "Molten",
                "073 697 1537",
                "johnmolton12@gmail.com",
                student);
        assertNotNull(parent);
        System.out.println(parent);
    }

    @Test
    public void buildWithError() {
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
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ParentFactory.build(null,
                        "John",
                        "Molten",
                        "073 697 1537",
                        "johnmolton12@gmail.com",
                        student));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Parent ID is required!", exceptionMessage);
    }
}