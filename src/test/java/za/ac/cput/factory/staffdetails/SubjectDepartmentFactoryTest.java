/* SubjectDepartmentFactoryTest.java
   Factory Test class for SubjectDepartment
   Author: Raeesah Williams (219091498)
   Date: 06 April 2022
*/
package za.ac.cput.factory.staffdetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.staffdetails.SubjectDepartment;
import static org.junit.jupiter.api.Assertions.*;

class SubjectDepartmentFactoryTest {
    @Test
    public void BuildWithSuccess()
    {
        SubjectDepartment subjectDepartment = SubjectDepartmentFactory.Build(
                "219091498",
                "Mathematics");
        assertNotNull(subjectDepartment);
        System.out.println(subjectDepartment);
    }

    @Test
    public void BuildWithError()
    {
        Exception error = assertThrows(IllegalArgumentException.class, () ->
                SubjectDepartmentFactory.Build(
                        "219091498",
                        null));
        String ExceptionMessage = error.getMessage();
        System.out.println(error);
        assertSame("Subject type is required", ExceptionMessage);
    }
}