package za.ac.cput.repository.StudentDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.StudentDetails.Sport;

public interface ISportRepository extends JpaRepository<Sport, String> {

}
