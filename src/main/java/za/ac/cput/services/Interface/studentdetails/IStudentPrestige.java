package za.ac.cput.services.Interface.studentdetails;

import za.ac.cput.domain.studentdetails.StudentPrestige;
import za.ac.cput.services.IService;

import java.util.List;

public interface IStudentPrestige extends IService<StudentPrestige, String> {
    List<StudentPrestige> findAll();
}
