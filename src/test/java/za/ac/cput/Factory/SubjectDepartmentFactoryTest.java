/* SubjectDepartmentFactoryTest.java
   Test class for SubjectDepartment
   Author: Raeesah Williams (219091498)
   Date: 06 April 2022
*/
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.SubjectDepartment;
import static org.junit.jupiter.api.Assertions.*;

public class SubjectDepartmentFactoryTest
{
    @Test
    void createSubjectDepartment()
    {
        SubjectDepartment subjectDepartment = SubjectDepartmentFactory.createSubjectDepartment(
                "9375",
                "947602855",
                "Informatics Department");
        assertNotNull(subjectDepartment);
        System.out.println(subjectDepartment);
    }
}
