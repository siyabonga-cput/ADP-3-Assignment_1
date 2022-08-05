package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.StudentPrestige;

import java.util.Set;

public interface IStudentPrestigeRepository extends IRepository <StudentPrestige, String> {

    public Set<StudentPrestige> getAll();

}
