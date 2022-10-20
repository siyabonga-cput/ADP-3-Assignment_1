package za.ac.cput.repository.studentdetailsrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.studentdetails.Sport;

public interface ISportRepository extends JpaRepository<Sport, String> {

}
