package za.ac.cput.Repository.ParentDetailsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.ParentDetails.Parent;

@Repository
public interface IParentRepository extends JpaRepository <Parent, String> {
}
