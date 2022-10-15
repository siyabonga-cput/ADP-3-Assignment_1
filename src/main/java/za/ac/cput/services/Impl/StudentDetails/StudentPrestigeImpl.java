/*  StudentPrestigeImpl.java
    Services
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
 */

package za.ac.cput.services.Impl.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.cput.domain.StudentDetails.StudentPrestige;
import za.ac.cput.repository.StudentDetailsRepo.IStudentPrestigeRepository;
import za.ac.cput.services.Interface.StudentDetails.IStudentPrestige;

import java.util.List;
import java.util.Optional;

@Service
public class StudentPrestigeImpl implements IStudentPrestige {
    @Autowired
    private final IStudentPrestigeRepository repository;

    @Autowired
    public StudentPrestigeImpl(IStudentPrestigeRepository repository) {
        this.repository = repository;
    }

    public List<StudentPrestige> findAll(){
        return this.repository.findAll();
    }

    public StudentPrestige save(StudentPrestige studentPrestige){
        return this.repository.save(studentPrestige);
    }

    public Optional<StudentPrestige> read(String id){
        return this.repository.findById(id);
    }

    public void delete(StudentPrestige studentPrestige){
        this.repository.delete(studentPrestige);
    }
}
