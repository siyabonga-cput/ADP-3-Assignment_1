/* TeacherControllerTest.java
Test the TeacherController
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.controller.StaffDetails;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.factory.Admin.AdminFactory;
import za.ac.cput.factory.StaffDetails.TeacherFactory;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TeacherControllerTest {
    public static String SECURITY_USERNAME= "user";
    public static String SECURITY_PASSWORD= "password";
    @LocalServerPort
    private int port;
    @Autowired
    private TeacherController teacherController;
    @Autowired
    private TestRestTemplate restTemplate;
    private Teacher teacher;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        assertNotNull(teacherController);
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");
        this.teacher = TeacherFactory.build(
                "36594",
                "Jimmy",
                "Beast",
                "039 359 1536",
                "Master degree",
                "None",
                "Government",
                admin);
        this.baseUrl = "http://localhost:" + this.port + "/abc-school-management/teacher";
    }

    @Test
    @Order(1)
    void findAll() {
        String url = baseUrl + "/all";
        System.out.println(url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Teacher[]> entity = new HttpEntity<>(null,headers);
        ResponseEntity<Teacher[]> response =
                restTemplate.withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                        .exchange(url, HttpMethod.GET,entity, Teacher[].class);
        System.out.println("Show all: ");
        System.out.println(response);
        System.out.println(response.getBody());
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 0)
        );
//        ResponseEntity<Teacher[]> response =
//                this.restTemplate.getForEntity(url, Teacher[].class);
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
        ResponseEntity<Teacher> response = this.restTemplate.postForEntity(url, this.teacher, Teacher.class);
        System.out.println(response);
        assertAll (
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(3)
    void read() {
        String url = baseUrl + "/read/" + this.teacher.getTeacherID();
        System.out.println(url);
        ResponseEntity<Teacher> response = this.restTemplate.getForEntity(url, Teacher.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(4)
    void delete() {
        String url = baseUrl + "/delete/" + this.teacher.getTeacherID();
        this.restTemplate.delete(url);
        System.out.println("Deleted");
    }

}