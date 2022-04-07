package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.StudentPrestige;

import static org.junit.jupiter.api.Assertions.*;

class StudentPrestigeFactoryTest {

    @Test
    void createStudentPrestige() {
        StudentPrestige studentPrestige = StudentPrestigeFactory.createStudentPrestige(1,219189048,12,1,1,"First Place Debate");
        assertNotNull(studentPrestige);
        System.out.println(studentPrestige);
    }
}