/* SubjectControllerTest.java
Test the SubjectController
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
import za.ac.cput.domain.StaffDetails.Subject;
import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.Admin.AdminFactory;
import za.ac.cput.factory.StaffDetails.SubjectDepartmentFactory;
import za.ac.cput.factory.StaffDetails.SubjectFactory;
import za.ac.cput.factory.StaffDetails.TeacherFactory;
import za.ac.cput.factory.StudentDetails.StudentFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SubjectControllerTest {
    public static String SECURITY_USERNAME= "user";
    public static String SECURITY_PASSWORD= "password";
    @LocalServerPort
    private int port;
    @Autowired
    private SubjectController subjectController;
    @Autowired
    private TestRestTemplate restTemplate;
    private Subject subject;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        assertNotNull(subjectController);
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");
        Teacher teacher = TeacherFactory.build(
                "36594",
                "Jimmy",
                "Beast",
                "039 359 1536",
                "Master degree",
                "None",
                "Government",
                admin);
        Student student = StudentFactory.Build(
                "2138532",
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        SubjectDepartment subjectDepartment = SubjectDepartmentFactory.Build(
                "219091498",
                "Mathematics");
        this.subject = SubjectFactory.build(
                "36259",
                "Math",
                56.30,
                65,
                subjectDepartment,
                student,
                teacher);
        this.baseUrl = "http://localhost:" + this.port + "/abc-school-management/subject";
    }

    @Test
    @Order(1)
    void findAll() {
        String url = baseUrl + "/all";
        System.out.println(url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Subject[]> entity = new HttpEntity<>(null,headers);
        ResponseEntity<Subject[]> response =
                restTemplate.withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                        .exchange(url, HttpMethod.GET,entity, Subject[].class);
        System.out.println("Show all: ");
        System.out.println(response);
        System.out.println(response.getBody());
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 1)
        );
//        ResponseEntity<Subject[]> response =
//                this.restTemplate.getForEntity(url, Subject[].class);
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
        ResponseEntity<Subject> response = this.restTemplate.postForEntity(url, this.subject, Subject.class);
        System.out.println(response);
        assertAll (
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(3)
    void read() {
        String url = baseUrl + "/read/" + this.subject.getSubjectID();
        System.out.println(url);
        ResponseEntity<Subject> response = this.restTemplate.getForEntity(url, Subject.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(4)
    void delete() {
        String url = baseUrl + "/delete/" + this.subject.getSubjectID();
        this.restTemplate.delete(url);
        System.out.println("Deleted");
    }
}