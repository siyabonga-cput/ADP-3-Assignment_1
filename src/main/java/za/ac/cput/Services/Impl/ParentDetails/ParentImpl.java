package za.ac.cput.Services.Impl.ParentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.ParentDetails.Parent;
import za.ac.cput.Repository.ParentDetailsRepo.IParentRepository;
import za.ac.cput.Services.Interface.ParentDetails.IParent;

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
