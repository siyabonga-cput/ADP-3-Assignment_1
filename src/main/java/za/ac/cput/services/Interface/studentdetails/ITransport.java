/* ITransport.java
   Service Interface for the Transport
   Author: Raeesah Williams (219091498)
   Date: 07 August 2022
*/

package za.ac.cput.services.Interface.studentdetails;

import za.ac.cput.domain.studentdetails.Transport;
import za.ac.cput.services.IService;
import java.util.List;

public interface ITransport extends IService<Transport, String>
{
    List<Transport> findAll();
}