package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Admin;

import java.util.Set;

public interface IAdminRepository extends IRepository<Admin, String> {

    public Set<Admin> getAll();
}
