package za.ac.cput.services.Interface.studentdetails;

import za.ac.cput.domain.studentdetails.Culture;
import za.ac.cput.services.IService;

import java.util.List;

public interface ICulture extends IService<Culture, String> {
    List<Culture> findAll();
}
