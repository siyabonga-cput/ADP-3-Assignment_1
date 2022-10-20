/* TeacherImpl.java
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.services.Impl.staffdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.staffdetails.Teacher;
import za.ac.cput.repository.staffdetailsrepo.ITeacherRepository;
import za.ac.cput.services.Interface.staffdetails.ITeacher;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherImpl implements ITeacher {
    private final ITeacherRepository repository;

    @Autowired
    public TeacherImpl(ITeacherRepository repository) {
        this.repository = repository;
    }

    @Override
    public Teacher save(Teacher teacher) {
        return this.repository.save(teacher);
    }

    @Override
    public Optional<Teacher> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public void delete(Teacher teacher) {
        this.repository.delete(teacher);
    }

    @Override
    public List<Teacher> findAll() {
        return this.repository.findAll();
    }

}
