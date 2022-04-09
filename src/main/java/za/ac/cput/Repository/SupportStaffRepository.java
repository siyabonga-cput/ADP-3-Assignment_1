/*
SupportStaffRepository.java
Repository for SupportStaffRepository
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.SupportStaff;
import java.util.HashSet;
import java.util.Set;

public class SupportStaffRepository implements ISupportStaffRepository {
    public static SupportStaffRepository repository = null;
    private Set<SupportStaff> supportStaffDB = null;

    private SupportStaffRepository() {
        supportStaffDB = new HashSet<SupportStaff>();
    }

    public static SupportStaffRepository getRepository() {
        if (repository == null) {
            repository = new SupportStaffRepository();
        }
        return repository;
    }

    //create
    @Override
    public SupportStaff create(SupportStaff supportStaff) {
        boolean success = supportStaffDB.add(supportStaff);
        if (!success)
            return null;
        return supportStaff;
    }

    //read
    @Override
    public SupportStaff read(String suppStaffID) {
        SupportStaff supportStaff = supportStaffDB.stream()
                .filter(e-> e.getSuppStaffID().equals(suppStaffID) )
                .findAny()
                .orElse(null);
        return supportStaff;
    }

    //update
    @Override
    public SupportStaff update(SupportStaff supportStaff) {
        SupportStaff oldSupportStaff = read(supportStaff.getSuppStaffID() );
        if (oldSupportStaff != null) {
            supportStaffDB.remove(oldSupportStaff);
            supportStaffDB.add(supportStaff);
            return null;
        }
        return supportStaff;
    }

    //delete
    @Override
    public boolean delete(String suppStaffID) {
        SupportStaff suppStaffToDelete = read(suppStaffID);
        if (suppStaffID == null)
            return  false;
        supportStaffDB.remove(suppStaffToDelete);
        return true;
    }

    //getAll
    @Override
    public Set<SupportStaff> getAll() {
        return supportStaffDB;
    }
}
