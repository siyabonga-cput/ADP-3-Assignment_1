package za.ac.cput.services.Interface.StudentDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.StudentDetails.Sport;
import za.ac.cput.services.IService;

import java.util.List;

public interface ISport extends IService<Sport, String> {
    List<Sport> findAll();
}
