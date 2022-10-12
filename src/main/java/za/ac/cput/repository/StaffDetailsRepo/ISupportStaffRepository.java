/*
ISupportStaff.java
Repository for ISupportStaffRepository
Author: Tiffany Kiwiets
*/

package za.ac.cput.repository.StaffDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.StaffDetails.SupportStaff;
import org.springframework.stereotype.Repository;


public interface ISupportStaffRepository extends JpaRepository<SupportStaff, String> {

}
