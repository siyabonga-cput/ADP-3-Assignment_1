/*
ISupportStaff.java
Repository for ISupportStaffRepository
Author: Tiffany Kiwiets
*/

package za.ac.cput.repository.staffdetailsrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.staffdetails.SupportStaff;


public interface ISupportStaffRepository extends JpaRepository<SupportStaff, String> {

}
