/* ITransportRepository.java
   Repository Interface for the Transport
   Author: Raeesah Williams (219091498)
   Date: 2 April 2022
*/
package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Transport;

import java.util.Set;

public interface ITransportRepository extends IRepository <Transport, String>
{
    public Set<Transport> getAll();
}
