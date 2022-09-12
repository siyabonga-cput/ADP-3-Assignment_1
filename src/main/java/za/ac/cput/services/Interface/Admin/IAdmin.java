package za.ac.cput.services.Interface.Admin;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.services.IService;

import java.util.List;
public interface IAdmin extends IService<Admin, String> {
    List<Admin> findall();
}
