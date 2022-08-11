/* ITeacherRepository.java
Repository package for ITeacherRepository
Author: Jayden Johnson (219086796)
Date: 4 April 2022
*/

package za.ac.cput.repository.StaffDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.StaffDetails.Teacher;

import java.util.Set;
@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, String> {
}
