package za.ac.cput.services.Impl.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.StudentDetails.Sport;
import za.ac.cput.repository.StudentDetailsRepo.ISportRepository;
import za.ac.cput.services.Interface.StudentDetails.ISport;

import java.util.List;
import java.util.Optional;

@Service
public class SportImpl implements ISport {
    @Autowired
    private final ISportRepository repository;

    @Autowired
    public SportImpl(ISportRepository repository){
        this.repository =  repository;
    }
    @Override
    public Sport save(Sport sport) {
        return this.repository.save(sport);
    }

    @Override
    public Optional<Sport> read(String id) {
        return this.repository.findById(id);
    }
    @Override
    public void delete(Sport sport) {
        this.repository.delete(sport);
    }

    @Override
    public List<Sport> findAll() {
        return this.repository.findAll();
    }

}