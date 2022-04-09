/* ISubjectRepository.java
Repository package for ISubjectRepository
Author: Jayden Johnson (219086796)
Date: 2 April 2022
*/

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Subject;

import java.util.Set;

public interface ISubjectRepository extends IRepository<Subject, String>{

    public Set<Subject> getAll();
}
