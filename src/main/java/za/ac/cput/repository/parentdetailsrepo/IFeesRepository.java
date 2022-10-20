/*
IFeesRepository.java
Repository for IFeesRepository
Author: Tiffany Kiwiets (219322732)
*/

package za.ac.cput.repository.parentdetailsrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.parentdetails.Fees;

@Repository
public interface IFeesRepository extends JpaRepository<Fees, String> {
}
