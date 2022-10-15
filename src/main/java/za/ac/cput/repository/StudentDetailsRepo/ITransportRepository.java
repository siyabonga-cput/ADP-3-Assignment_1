/* ITransportRepository.java
   IRepository for the Transport
   Author: Raeesah Williams (219091498)
   Date: 07 August 2022
*/

package za.ac.cput.repository.StudentDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.StudentDetails.Transport;

@Repository
public interface ITransportRepository extends JpaRepository<Transport, String> {
}