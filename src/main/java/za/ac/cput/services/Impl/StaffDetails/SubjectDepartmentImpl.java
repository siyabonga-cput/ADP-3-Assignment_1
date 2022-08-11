/* SubjectDepartmentImpl.java
   Service Implementation for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 07 August 2022
*/
package za.ac.cput.services.Impl.StaffDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import za.ac.cput.repository.StaffDetailsRepo.ISubjectDepartmentRepository;
import za.ac.cput.services.Interface.StaffDetails.ISubjectDepartment;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectDepartmentImpl implements ISubjectDepartment
{
    private final ISubjectDepartmentRepository repository;

    @Autowired
    public SubjectDepartmentImpl(ISubjectDepartmentRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public SubjectDepartment save (SubjectDepartment subjectDepartment)
    {
        return this.repository.save(subjectDepartment);
    }

    @Override
    public Optional<SubjectDepartment> read(String s)
    {
        return this.repository.findById(s);
    }

    @Override
    public void delete(SubjectDepartment subjectDepartment)
    {
        this.repository.delete(subjectDepartment);
    }

    @Override
    public List<SubjectDepartment> findAll()
    {
        return this.repository.findAll();
    }
}
