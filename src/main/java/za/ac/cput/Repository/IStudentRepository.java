/* IStudentRepository.java
Repository for IStudentRepository
Author: Marvin Peter Hope (219445842)
Date: 2 April 2022
*/

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Student;

import java.util.Set;

public interface IStudentRepository extends IRepository <Student, String> {
    public Set<Student> getAll();
}
