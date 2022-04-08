/* ParentFactoryTest.java
Testing for ParentFactoryTest
Author: Marvin Peter Hope (219445842)
Date: 4 April 2022
*/

package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.Parent;

import static org.junit.jupiter.api.Assertions.*;

class ParentFactoryTest {

    @Test
    void createParent() {
        Parent parent = ParentFactory.createParent(03456,
                "James",
                "Brown",
                "0876543234",
                "jamerbrown987@gmail.com");
        assertNotNull(parent);
        System.out.println(parent);
    }
}