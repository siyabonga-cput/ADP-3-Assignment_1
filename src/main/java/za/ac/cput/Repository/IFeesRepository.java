/*
IFeesRepository.java
Repository for IFeesRepository
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Fees;
import java.util.Set;

public interface IFeesRepository extends IRepository <Fees, String> {
    public Set<Fees> getAll();
}
