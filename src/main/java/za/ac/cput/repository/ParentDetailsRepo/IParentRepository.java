/* IParentRepository.java
Repository for IParentRepository
Author: Marvin Peter Hope (219445842)
Date: 2 April 2022
*/

package za.ac.cput.repository.ParentDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.ParentDetails.Parent;

import java.util.Set;

@Repository
public interface IParentRepository extends JpaRepository<Parent, String> {
}
