/* SubjectDepartmentRepositoryTest.java
   Repository Test class for SubjectDepartment
   Author: Raeesah Williams (219091498)
   Date: 06 April 2022
*/
package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Domain.Entity.SubjectDepartment;
import za.ac.cput.Factory.SubjectDepartmentFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class SubjectDepartmentRepositoryTest
{
    private static SubjectDepartmentRepository repository = SubjectDepartmentRepository.getRepository();
    private static SubjectDepartment subjectDepartment = SubjectDepartmentFactory.createSubjectDepartment
            ("217480264",
                    "289475017",
                    "Engineering Department");

    @Test
    void a_create()
    {
        SubjectDepartment created = repository.create(subjectDepartment);
        assertEquals(subjectDepartment.getSubDeptID(), created.getSubDeptID());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read()
    {
        SubjectDepartment read = repository.read(subjectDepartment.getSubDeptID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update()
    {
        SubjectDepartment updated = new SubjectDepartment.Builder().copy(subjectDepartment)
                .setSubDeptID("9385")
                .setSubjectID("9274")
                .setTeacherID("937502846")
                .setTypeOfDepartment("Science Department")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete()
    {
        boolean success = repository.delete(subjectDepartment.getSubDeptID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll()
    {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}