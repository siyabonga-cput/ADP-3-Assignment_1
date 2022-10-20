/*
ISupportStaff.java
Enable services
Author: Tiffany Kiwiets (219322732)
*/

package za.ac.cput.services.Interface.staffdetails;

import za.ac.cput.domain.staffdetails.SupportStaff;
import za.ac.cput.services.IService;

import java.util.List;

public interface ISupportStaff extends IService<SupportStaff, String> {
    List<SupportStaff> findall();
}
