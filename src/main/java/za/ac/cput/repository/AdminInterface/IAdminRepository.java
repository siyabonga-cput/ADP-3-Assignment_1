package za.ac.cput.repository.AdminInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Admin.Admin;


import java.util.Set;
@Repository
public interface IAdminRepository extends JpaRepository<Admin, String> {

}
