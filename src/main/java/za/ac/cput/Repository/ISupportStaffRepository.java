/*
ISupportStaff.java
Repository for ISupportStaffRepository
Author: Tiffany Kiwiets
 */

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.SupportStaff;
import java.util.Set;

public interface ISupportStaffRepository extends IRepository <SupportStaff, String> {
    public Set<SupportStaff> getAll();
}
