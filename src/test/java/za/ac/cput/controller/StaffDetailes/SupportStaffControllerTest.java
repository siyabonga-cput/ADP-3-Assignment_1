/*
SupportStaffControllerTest.java
Test for the SupportStaffController
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.controller.StaffDetailes;


import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.controller.StaffDetails.SupportStaffController;
import za.ac.cput.domain.StaffDetails.SupportStaff;
import za.ac.cput.factory.StaffDetails.SupportStaffFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SupportStaffControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private SupportStaffController supportStaffController;

    @Autowired
    private TestRestTemplate restTemplate;
    private SupportStaff supportStaff;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        assertNotNull(supportStaffController);
        Admin admin = AdminFactory.createAdmin(
                "6325984",
                "48569 1266 75896");

        this.supportStaff = SupportStaffFactory.build(
                "635941258",
                "Julius",
                "Jacob",
                "0856911259",
                "Allegic to bees",
                "Degree in sport management",
                "Head of sports management",
                admin);
        this.baseUrl = "http://localhost:" + this.port + "/abc-school-management/supportStaff";
    }

    @Test
    @Order(1)
    void findAll() {
        String url = baseUrl + "/all";
        System.out.println(url);
        ResponseEntity<SupportStaff[]> response =
                this.restTemplate.getForEntity(url, SupportStaff[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 0 )
        );
    }

    @Test
    @Order(2)
    void save() {
        String url = baseUrl + "/save";
        System.out.println(url);
        ResponseEntity<SupportStaff> response = this.restTemplate.postForEntity(url, this.supportStaff, SupportStaff.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(3)
    void read() {
        String url = baseUrl + "/read/" + this.supportStaff.getSuppStaffID();
        System.out.println(url);
        ResponseEntity<SupportStaff> response = this.restTemplate.getForEntity(url, SupportStaff.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(4)
    void delete() {
        String url = baseUrl + "/delete/" + this.supportStaff.getSuppStaffID();
        this.restTemplate.delete(url);
        System.out.println("Deleted!");
    }

}
