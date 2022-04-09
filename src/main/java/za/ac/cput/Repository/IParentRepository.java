/* IParentRepository.java
Repository for IParentRepository
Author: Marvin Peter Hope (219445842)
Date: 2 April 2022
*/

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Parent;

import java.util.Set;

public interface IParentRepository extends IRepository <Parent, String> {
    public Set<Parent> getAll();
}
