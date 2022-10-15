package za.ac.cput.repository.AdminRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Admin.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, String> {

}
