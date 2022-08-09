/*
ISupportStaffRepository.java
Repository for SupportStaffRepository
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.repository.StaffDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.StaffDetails.SupportStaff;

public interface ISupportStaffRepository extends JpaRepository <SupportStaff, String> {

}
