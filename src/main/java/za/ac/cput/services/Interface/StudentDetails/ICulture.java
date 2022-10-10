package za.ac.cput.services.Interface.StudentDetails;

import za.ac.cput.domain.StudentDetails.Culture;
import za.ac.cput.services.IService;

import java.util.List;

public interface ICulture extends IService<Culture, String> {
    List<Culture> findAll();
}
