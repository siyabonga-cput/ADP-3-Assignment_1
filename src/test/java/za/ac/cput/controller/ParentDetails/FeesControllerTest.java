/*
FeesControllerTest.java
Test for the FeesController
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.controller.ParentDetails;


import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.controller.StaffDetails.SupportStaffController;
import za.ac.cput.domain.ParentDetails.Fees;
import za.ac.cput.factory.ParentDetails.FeesFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FeesControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private FeesController feesController;

    @Autowired
    private TestRestTemplate restTemplate;
    private Admin admin;
    private Fees fees;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        assertNotNull(feesController);
        Admin admin = adminFactory.createAdmin(
                "2456589",
                "40963 6588 42156");

        Student student = StudentFactory.createStudent(
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);

        Parent parent = ParentFactory.createParent(student,
                "John",
                "Molten",
                "073 697 1537",
                "johnmolton12@gmail.com");

        this.fees = FeesFactory.build(
                "8596321",
                student,
                admin,
                parent,
                "20000.00"
        );
        this.baseUrl = "http://localhost:" + this.port + "/abc-school-management";
    }

    @Test
    @Order(1)
    void findAll() {
        String url = baseUrl + "/all";
        System.out.println(url);
        ResponseEntity<Fees[]> response =
                this.restTemplate.getForEntity(url, Fees[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 0)
        );
    }

    @Test
    @Order(2)
    void save() {
        String url = baseUrl + "/save";
        System.out.println(url);
        ResponseEntity<Fees> response = this.restTemplate.postForEntity(url, this.fees, Fees.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(3)
    void read() {
        String url = baseUrl + "/read/" + this.fees.getFeeID();
        System.out.println(url);
        ResponseEntity<Fees> response = this.restTemplate.getForEntity(url, Fees.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(4)
    void delete() {
        String url = baseUrl + "/delete/" + this.fees.toString();
        this.restTemplate.delete(url);
        System.out.println("Deleted!");
    }

}
