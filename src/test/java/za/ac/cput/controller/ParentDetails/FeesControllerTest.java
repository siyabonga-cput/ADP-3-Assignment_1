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
import org.springframework.http.*;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.ParentDetails.Fees;
import za.ac.cput.domain.ParentDetails.Parent;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.Admin.AdminFactory;
import za.ac.cput.factory.ParentDetails.FeesFactory;
import za.ac.cput.factory.ParentDetails.ParentFactory;
import za.ac.cput.factory.StudentDetails.StudentFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FeesControllerTest {
    public static String SECURITY_USERNAME= "user";
    public static String SECURITY_PASSWORD= "password";
    @LocalServerPort
    private int port;
    @Autowired
    private FeesController feesController;
    @Autowired
    private TestRestTemplate restTemplate;
    private Admin admin;
    private Student student;
    private Parent parent;
    private Fees fees;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        assertNotNull(feesController);
        this.admin = AdminFactory.createAdmin(
                "2456589",
                "40963658842156");

        this.student = StudentFactory.Build(
                "2138532",
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        this.parent = ParentFactory.build("2343544",
                "John",
                "Molten",
                "073 697 1537",
                "johnmolton12@gmail.com",
                student);
        this.fees = FeesFactory.build(
                "34532"
                ,student
                ,admin
                ,parent
                ,2000.00);
        this.baseUrl = "http://localhost:" + this.port + "/abc-school-management/fees";
    }

    @Test
    @Order(1)
    void findAll() {
        String url = baseUrl + "/all";
        System.out.println(url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Fees[]> entity = new HttpEntity<>(null,headers);
        ResponseEntity<Fees[]> response =
                restTemplate.withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                        .exchange(url, HttpMethod.GET,entity, Fees[].class);
        System.out.println("Show all: ");
        System.out.println(response);
        System.out.println(response.getBody());
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 0)
        );
//        ResponseEntity<Fees[]> response =
//                this.restTemplate.getForEntity(url, Fees[].class);
//        System.out.println(Arrays.asList(response.getBody()));
//        assertAll(
//                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                () -> assertTrue(response.getBody().length == 0)
//        );
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
        String url = baseUrl + "/delete/" + this.fees.getFeeID();
        this.restTemplate.delete(url);
        System.out.println("Deleted!");
    }
}