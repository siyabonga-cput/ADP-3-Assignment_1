/*
SupportStaffControllerTest.java
Test for the SupportStaffController
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.controller.staffdetails;


import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import za.ac.cput.domain.admin.Admin;
import za.ac.cput.domain.staffdetails.SupportStaff;
import za.ac.cput.factory.admin.AdminFactory;
import za.ac.cput.factory.staffdetails.SupportStaffFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SupportStaffControllerTest {

    public static String SECURITY_USERNAME= "user";
    public static String SECURITY_PASSWORD= "password";
    @LocalServerPort
    private int port;
    @Autowired
    private SupportStaffController supportStaffController;

    @Autowired
    private TestRestTemplate restTemplate;
    private Admin admin;
    private SupportStaff supportStaff;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        assertNotNull(supportStaffController);
       this.admin = AdminFactory.createAdmin(
                "6325984",
                "48569 1266 75896");

        this.supportStaff = SupportStaffFactory.build(
                "635941258",
                "Julius",
                "Jacob",
                "08569112567",
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
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<SupportStaff[]> entity = new HttpEntity<>(null,headers);
        ResponseEntity<SupportStaff[]> response =
                restTemplate.withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                        .exchange(url, HttpMethod.GET,entity, SupportStaff[].class);
        System.out.println("Show all: ");
        System.out.println(response);
        System.out.println(response.getBody());
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 1)
        );

//        ResponseEntity<SupportStaff[]> response =
//                this.restTemplate.getForEntity(url, SupportStaff[].class);
//        System.out.println(Arrays.asList(response.getBody()));
//        assertAll(
//                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                () -> assertTrue(response.getBody().length == 0 )
//        );
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
