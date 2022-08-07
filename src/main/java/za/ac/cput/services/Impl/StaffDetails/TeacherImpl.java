/* TeacherImpl.java
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.services.Impl.StaffDetails;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.repository.StaffDetailsRepo.ITeacherRepository;
import za.ac.cput.services.Interface.StaffDetails.ITeacher;

import java.util.List;
import java.util.Optional;


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
    public List<Teacher> findall() {
        return this.repository.findAll();
    }

}
