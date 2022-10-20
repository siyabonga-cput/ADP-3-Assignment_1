/* ITeacherRepository.java
Repository package for ITeacherRepository
Author: Jayden Johnson (219086796)
Date: 4 April 2022
*/

package za.ac.cput.repository.staffdetailsrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.staffdetails.Teacher;


@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, String> {
}
