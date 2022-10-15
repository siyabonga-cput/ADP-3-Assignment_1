/* StudentImpl.java
Enabling Service
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/
package za.ac.cput.services.Impl.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.repository.StudentDetailsRepo.IStudentRepository;
import za.ac.cput.services.Interface.StudentDetails.IStudent;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements IStudent {
    @Autowired
    private final IStudentRepository repository;

    @Autowired
    public StudentImpl(IStudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        return this.repository.save(student);
    }

    @Override
    public Optional<Student> read(String id) {
        return this.repository.findById(id);
    }
    @Override
    public void delete(Student student) {
        this.repository.delete(student);
    }

    @Override
    public List<Student> findAll() {
        return this.repository.findAll();
    }
}