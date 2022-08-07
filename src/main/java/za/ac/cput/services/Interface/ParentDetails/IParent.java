/* IParent.java
Enabling Service
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/

package za.ac.cput.services.Interface.ParentDetails;

import za.ac.cput.domain.ParentDetails.Parent;
import za.ac.cput.services.IService;

import java.util.List;

public interface IParent extends IService<Parent, String> {
    List<Parent> findall();
}

