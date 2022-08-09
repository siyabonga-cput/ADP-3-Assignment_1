/* ISubjectDepartment.java
   Service Interface for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 07 August 2022
*/

package za.ac.cput.services.Interface.StaffDetails;

import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import za.ac.cput.services.IService;
import java.util.List;

public interface ISubjectDepartment extends IService<SubjectDepartment, String>
{
    List<SubjectDepartment> findAll();
}
