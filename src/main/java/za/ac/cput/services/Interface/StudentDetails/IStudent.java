/* IStudent.java
Enabling Service
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/
package za.ac.cput.services.Interface.StudentDetails;

import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.services.IService;

import java.util.List;

public interface IStudent extends IService<Student, String> {
    List<Student> findall();
}
