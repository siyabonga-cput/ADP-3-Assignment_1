package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Culture;

import java.util.Set;

public interface ICultureRepository extends IRepository <Culture, String>{

    public Set<Culture> getAll();
}
