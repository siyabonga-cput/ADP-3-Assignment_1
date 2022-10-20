/*  CultureImpl.java
    Services
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
 */

package za.ac.cput.services.Impl.studentdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.studentdetails.Culture;
import za.ac.cput.repository.studentdetailsrepo.ICultureRepository;
import za.ac.cput.services.Interface.studentdetails.ICulture;

import java.util.List;
import java.util.Optional;

@Service
public class CultureImpl implements ICulture {
    private final ICultureRepository repository;

    @Autowired
    public CultureImpl(ICultureRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Culture> findAll(){
        return this.repository.findAll();
    }
    @Override
    public Culture save(Culture culture){
        return this.repository.save(culture);
    }
    @Override
    public Optional<Culture> read (String id){
        return this.repository.findById(id);
    }
    @Override
    public void delete(Culture culture){
        this.repository.delete(culture);
    }
}