/*  StudentPrestigeImplTest.java
    StudentPrestige services Tests
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
 */

package za.ac.cput.services.Impl.StudentDetails;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.StudentDetails.Culture;
import za.ac.cput.domain.StudentDetails.StudentPrestige;
import za.ac.cput.repository.StudentDetailsRepo.IStudentPrestigeRepository;
import za.ac.cput.services.Interface.StudentDetails.IStudentPrestige;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentPrestigeImplTest {
    private StudentPrestige studentPrestige;
    @Autowired private IStudentPrestige service;

    @Test
    @Order(1)
    void findAll() {
        List<StudentPrestige> studentPrestigeList = this.service.findAll();
        System.out.println(studentPrestigeList);
        assertEquals(1,studentPrestigeList.size());
    }

    @Test
    @Order(2)
    void save() {
        StudentPrestige save = this.service.save(this.studentPrestige);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    @Order(3)
    void read() {
        Optional<StudentPrestige> read = this.service.read(this.studentPrestige.getPrestigeId());
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()-> assertSame(this.studentPrestige, read.get())
        );
    }

    @Test
    @Order(4)
    void delete() {
        this.service.delete(this.studentPrestige);
    }
}