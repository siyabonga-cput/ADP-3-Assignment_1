package za.ac.cput.services.Impl.ParentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.ParentDetails.Fees;
import za.ac.cput.repository.ParentDetailsRepo.IFeesRepository;
import za.ac.cput.services.Interface.ParentDetails.IFees;

import java.util.List;
import java.util.Optional;

@Service
public class FeesImpl implements IFees {
    private final IFeesRepository repository;

    @Autowired public FeesImpl(IFeesRepository repository){
        this.repository = repository;
    }

    @Override
    public Fees save(Fees fees) {
        return this.repository.save(fees);
    }

    @Override
    public Optional<Fees> read(String id) {
        return this.repository.findById(id);
    }

    @Override
    public void delete(Fees fees) {
        this.repository.delete(fees);
    }

    @Override
    public List<Fees> findAll() {
        return this.repository.findAll();
    }
}
