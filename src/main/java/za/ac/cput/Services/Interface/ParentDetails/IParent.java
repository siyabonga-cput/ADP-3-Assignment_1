// Marvin Hope -219445842
// IEmployeeService.java
// 09 June 2022

package za.ac.cput.Services.Interface.ParentDetails;

import za.ac.cput.Domain.ParentDetails.Parent;
import za.ac.cput.Services.IService;

import java.util.List;

public interface IParent extends IService<Parent, String> {
    List<Parent> findall();
}

