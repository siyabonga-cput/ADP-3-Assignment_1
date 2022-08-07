/* ITeacher.java
Enabling Service
Author: Jayden Johnson 219086796
Date: 7 August 2022
*/

package za.ac.cput.services.Interface.StaffDetails;

import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.services.IService;

import java.util.List;

public interface ITeacher extends IService <Teacher, String> {
    List<Teacher> findall();
}
