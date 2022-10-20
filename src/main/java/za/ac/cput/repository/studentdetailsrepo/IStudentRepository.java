/* IStudentRepository.java
Repository for IStudentRepository
Author: Marvin Peter Hope (219445842)
Date: 2 April 2022
*/

package za.ac.cput.repository.studentdetailsrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.studentdetails.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, String> {
}
