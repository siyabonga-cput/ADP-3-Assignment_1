/* ISubject.java
Enabling Service
Author: Jayden Johnson 219086796
Date: 7 August 2022
*/

package za.ac.cput.services.Interface.staffdetails;

import za.ac.cput.domain.staffdetails.Subject;
import za.ac.cput.services.IService;

import java.util.List;

public interface ISubject extends IService <Subject, String> {
    List<Subject> findAll();
}
