package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Sport;

import java.util.Set;

public interface ISportRepository extends IRepository<Sport, String> {


  public Set<Sport> getAll();
}
