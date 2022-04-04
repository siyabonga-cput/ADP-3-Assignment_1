/* ParentRepository.java
Repository for ParentRepository
Author: Marvin Peter Hope (219445842)
Date: 2 April 2022
*/

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Parent;

import java.util.HashSet;
import java.util.Set;

public class ParentRepository implements IParentRepository {
    private static ParentRepository repository = null;
    private Set<Parent> parentDB = null;

    private ParentRepository() {
        parentDB = new HashSet<Parent>();
    }

    public static ParentRepository getRepository() {
        if (repository == null) {
            repository = new ParentRepository();
        }
        return repository;
    }
    //===========================================
    //Create
    @Override
    public Parent create(Parent parent) {
        boolean success = parentDB.add(parent);
        if (!success)
            return null;
        return parent;
    }
    //===========================================
    //read
    @Override
    public Parent read(String parentID) {
        Parent parent = parentDB.stream()
                .filter(e-> e.getParentID().equals(parentID))
                .findAny()
                .orElse(null);
        return parent;
    }
    //===========================================
    //Update
    @Override
    public Parent update(Parent parent) {
        Parent oldparent = read(parent.getParentID());
        if (oldparent != null){
            parentDB.remove(oldparent);
            parentDB.add(parent);
            return parent;
        }
        return null;
    }
    //===========================================
    //Delete
    @Override
    public boolean delete(String parentID) {
        Parent parentToDelete = read(parentID);
        if(parentID == null)
            return false;
        parentDB.remove(parentToDelete);
        return true;
    }
    //===========================================
    //getAll()
    @Override
    public Set<Parent> getAll() {
        return parentDB;
    }
}