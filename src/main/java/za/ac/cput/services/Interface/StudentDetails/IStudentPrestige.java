package za.ac.cput.services.Interface.StudentDetails;

import za.ac.cput.domain.StudentDetails.StudentPrestige;
import za.ac.cput.services.IService;

import java.util.List;

public interface IStudentPrestige extends IService<StudentPrestige, String> {
    List<StudentPrestige> findAll();
}
