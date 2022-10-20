/* ParentImpl.java
Enabling Service
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/
package za.ac.cput.services.Impl.parentdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.parentdetails.Parent;
import za.ac.cput.repository.parentdetailsrepo.IParentRepository;
import za.ac.cput.services.Interface.parentdetails.IParent;

import java.util.List;
import java.util.Optional;

@Service
public class ParentImpl implements IParent {
    private final IParentRepository repository;

    @Autowired public ParentImpl(IParentRepository repository) {
        this.repository = repository;
    }
    @Override
    public Parent save(Parent parent) {
        return this.repository.save(parent);
    }
    @Override
    public Optional<Parent> read(String s) {
        return this.repository.findById(s);
    }
    @Override
    public void delete(Parent parent) {
        this.repository.delete(parent);
    }

    @Override
    public List<Parent> findall() {
        return this.repository.findAll();
    }
}
