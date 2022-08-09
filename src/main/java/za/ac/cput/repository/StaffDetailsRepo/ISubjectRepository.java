/* ISubjectRepository.java
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.repository.StaffDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.StaffDetails.Subject;

@Repository
public interface ISubjectRepository extends JpaRepository<Subject, String> {
}
