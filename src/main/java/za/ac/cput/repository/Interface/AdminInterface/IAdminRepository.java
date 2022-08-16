package za.ac.cput.repository.Interface.AdminInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Admin.Admin;


import java.util.Set;

public interface IAdminRepository extends JpaRepository<Admin, String> {



}
