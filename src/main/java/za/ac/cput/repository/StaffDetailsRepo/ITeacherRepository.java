/* ITeacherRepository.java
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.repository.StaffDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.StaffDetails.Teacher;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, String> {
}
