/* SubjectDepartmentRepository.java
   Repository Interface for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 07 August 2022
*/

package za.ac.cput.repository.StaffDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectDepartmentRepository extends JpaRepository<SubjectDepartment, String> {

}