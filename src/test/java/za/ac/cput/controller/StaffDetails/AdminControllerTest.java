package za.ac.cput.controller.StaffDetails;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Admin.Admin;

import za.ac.cput.factory.Admin.AdminFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AdminControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private AdminController Controller;
    @Autowired
    private TestRestTemplate restTemplate;
    private AdminController adminController;
    private String baseUrl;

    @BeforeEach
    void setUp() {

        assertNotNull(Controller);
        Admin admin = AdminFactory.createAdmin(
                "219200815",
                "242242242");

        this.baseUrl = "http://localhost:" + this.port + "/abc-school-management/teacher";

    }

    @Test
    @Order(1)
    void findAll() {
        String url = baseUrl + "/all";
        System.out.println(url);
        ResponseEntity<Admin[]> response =
                this.restTemplate.getForEntity(url, Admin[].class);
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
        ResponseEntity<Admin> response = this.restTemplate.postForEntity(url, this.adminController, Admin.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(3)
    void read() {
        String url = baseUrl + "/read/" + this.adminController.findAll();
        System.out.println(url);
        ResponseEntity<Admin> response = this.restTemplate.getForEntity(url, Admin.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(4)
    void delete() {
        String url = baseUrl + "/delete/" + this.adminController.findAll();
        this.restTemplate.delete(url);
        System.out.println("Deleted Record! ");
    }



}