/* ISubjectRepository.java
Repository package for ISubjectRepository
Author: Jayden Johnson (219086796)
Date: 2 April 2022
*/

package za.ac.cput.repository.staffdetailsrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.staffdetails.Subject;


@Repository
public interface ISubjectRepository extends JpaRepository<Subject, String> {
}
