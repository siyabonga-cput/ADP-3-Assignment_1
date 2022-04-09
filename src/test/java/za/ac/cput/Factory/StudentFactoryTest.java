/* StudentFactoryTest.java
Testing for StudentFactoryTest
Author: Marvin Peter Hope (219445842)
Date: 4 April 2022
*/

package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    void createStudent() {
       Student student = StudentFactory.createStudent(10098,
               012345,
               "Will",
               "Smith",
               9,
               "15 May 2001",
               00122234455,
               "24 Hope Street",
               "Healthy",
               68.5);
        assertNotNull(student);
        System.out.println(student);
    }
}