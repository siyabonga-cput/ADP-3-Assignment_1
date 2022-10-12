/*  ICultureRepository.java
    JpaRepository
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
 */

package za.ac.cput.repository.StudentDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.StudentDetails.Culture;


@Repository
public interface ICultureRepository extends JpaRepository <Culture, String> {

}

