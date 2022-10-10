/* CultureControllerTest.java
   Controller Tests for Culture
   Author: Kegomoditswe Leshope - 219189048
   Date:  7 September 2022
*/

package za.ac.cput.controller.StudentDetails;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import za.ac.cput.domain.StudentDetails.Culture;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.StudentDetails.CultureFactory;
import za.ac.cput.factory.StudentDetails.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CultureControllerTest {
    @LocalServerPort
    private int port;

    @Autowired CultureController controller;
    @Autowired TestRestTemplate restTemplate;
    private Culture culture;
    private Student student;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        assertNotNull(controller);
        this.culture = CultureFactory.build("01","Dance", student.getStudentID());
        this.student = StudentFactory.Build("2138532", "Jack", "Molten", 12, "5th January 1999", 3345, "14 Hope Street Cape Town", "None", 54.6);
        this.baseUrl = "http://localhost:" + this.port + "/abc-school-management/student";
    }

    @Test
    void save() {
    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }

    @Test
    void findAll() {
    }
}