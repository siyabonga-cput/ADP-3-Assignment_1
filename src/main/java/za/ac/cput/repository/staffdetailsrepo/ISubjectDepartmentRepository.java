/* ISubjectDepartmentRepository.java
   Repository Interface for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 07 August 2022
*/

package za.ac.cput.repository.staffdetailsrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.staffdetails.SubjectDepartment;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectDepartmentRepository extends JpaRepository<SubjectDepartment, String> {

}