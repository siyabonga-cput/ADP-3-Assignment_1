/* ITeacherRepository.java
Repository package for ITeacherRepository
Author: Jayden Johnson (219086796)
Date: 4 April 2022
*/

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Teacher;

import java.util.Set;

public interface ITeacherRepository extends IRepository<Teacher, String>{
    public Set<Teacher> getAll();
}
