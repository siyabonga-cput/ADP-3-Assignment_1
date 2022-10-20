package za.ac.cput.repository.adminrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.admin.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, String> {

}
