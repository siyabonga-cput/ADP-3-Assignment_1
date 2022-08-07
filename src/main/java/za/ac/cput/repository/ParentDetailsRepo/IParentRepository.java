/* IParentRepository.java
Enabling jpaRepository
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/
package za.ac.cput.repository.ParentDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.ParentDetails.Parent;

@Repository
public interface IParentRepository extends JpaRepository <Parent, String> {
}
