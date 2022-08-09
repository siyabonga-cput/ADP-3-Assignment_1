/*
IFeesRepository.java
Repository for FeesRepository
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.repository.ParentDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.ParentDetails.Fees;

public interface IFeesRepository extends JpaRepository <Fees, String> {

}
