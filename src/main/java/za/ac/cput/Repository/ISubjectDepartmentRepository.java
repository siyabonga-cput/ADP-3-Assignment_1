/* SubjectDepartmentRepository.java
   Repository Interface for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 2 April 2022
*/

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.SubjectDepartment;

import java.util.Set;

public interface ISubjectDepartmentRepository extends IRepository <SubjectDepartment, String>
{
    public Set<SubjectDepartment> getAll();
}

