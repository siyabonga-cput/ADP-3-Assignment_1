/* SubjectFactoryTest.java
Test the SubjectFactory
Author: Jayden Johnson (219086796)
Date: 6 April 2022
*/

package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.Subject;
import static org.junit.jupiter.api.Assertions.*;

public class SubjectFactoryTest {

    @Test
    void createSubject() {
        Subject subject = SubjectFactory.createSubject("6957",
                "6548",
                "Math",
                86.28,
                92);
        assertNotNull(subject);
        System.out.println(subject);
    }

}
