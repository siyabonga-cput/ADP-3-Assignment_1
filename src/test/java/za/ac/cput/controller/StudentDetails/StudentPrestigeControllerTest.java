///* StudentPrestigeControllerTest.java
//   Controller Tests for StudentPrestige
//   Author: Kegomoditswe Leshope - 219189048
//   Date:  7 September 2022
//*/
//
//package za.ac.cput.controller.StudentDetails;
//
//import org.junit.jupiter.api.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import za.ac.cput.domain.Admin.Admin;
//import za.ac.cput.domain.StaffDetails.Subject;
//import za.ac.cput.domain.StaffDetails.SubjectDepartment;
//import za.ac.cput.domain.StaffDetails.Teacher;
//import za.ac.cput.domain.StudentDetails.Culture;
//import za.ac.cput.domain.StudentDetails.Sport;
//import za.ac.cput.domain.StudentDetails.Student;
//import za.ac.cput.domain.StudentDetails.StudentPrestige;
//import za.ac.cput.factory.Admin.AdminFactory;
//import za.ac.cput.factory.StaffDetails.SubjectDepartmentFactory;
//import za.ac.cput.factory.StaffDetails.SubjectFactory;
//import za.ac.cput.factory.StaffDetails.TeacherFactory;
//import za.ac.cput.factory.StudentDetails.CultureFactory;
//import za.ac.cput.factory.StudentDetails.SportFactory;
//import za.ac.cput.factory.StudentDetails.StudentFactory;
//import za.ac.cput.factory.StudentDetails.StudentPrestigeFactory;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class StudentPrestigeControllerTest {
//    @LocalServerPort
//    private int port;
//    @Autowired
//    private StudentPrestigeController Controller;
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private Student student;
//    private Admin admin;
//    private Teacher teacher;
//    private Sport sport;
//    private Culture culture;
//    private Subject subject;
//    private SubjectDepartment subjectDepartment;
//    private StudentPrestige studentPrestige;
//
//    private String baseUrl;
//
//    @BeforeEach
//    void Setup() {
//        assertNotNull(Controller);
//        this.student = StudentFactory.Build(
//                "2138532",
//                "Jack",
//                "Molten",
//                12,
//                "5th January 1999",
//                3345,
//                "14 Hope Street Cape Town",
//                "None",
//                54.6);
//        this.admin = AdminFactory.createAdmin(
//                "3245643",
//                "45694 3244 54324");
//
//        this.teacher = TeacherFactory.build("365241",
//                "John",
//                "Zack",
//                "Degree in maths",
//                "Masters degree",
//                "none",
//                "Government",
//                admin);
//        this.sport = SportFactory.createSport(
//                "05",
//                student,
//                teacher,
//                "85");
//        this.subjectDepartment = SubjectDepartmentFactory.Build(
//                "219091498",
//                "Mathematics");
//
//        this.subject = SubjectFactory.build(
//                "36259",
//                "Math",
//                56.30,
//                65,
//                subjectDepartment,
//                student,
//                teacher);
//        this.culture = CultureFactory.build(
//                "01",
//                "Dance",
//                student);
//        this.studentPrestige = StudentPrestigeFactory.build(
//                "01",
//                "Certificate",
//                student,
//                sport,
//                culture,
//                subject);
//        this.baseUrl = "http://localhost:" + this.port + "/abc-school-management/studentprestige";
//    }
//    @Test
//    @Order(1)
//    void findAll() {
//        String url = baseUrl + "/all";
//        System.out.println(url);
//        ResponseEntity<StudentPrestige[]> response =
//                this.restTemplate.getForEntity(url, StudentPrestige[].class);
//        System.out.println(Arrays.asList(response.getBody()));
//        assertAll(
//                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                () -> assertTrue(response.getBody().length == 0 )
//        );
//    }
//
//    @Test
//    @Order(2)
//    void save() {
//        String url = baseUrl + "/save";
//        System.out.println(url);
//        ResponseEntity<StudentPrestige> response = this.restTemplate.postForEntity(url, this.studentPrestige, StudentPrestige.class);
//        System.out.println(response);
//        assertAll (
//                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                () -> assertNotNull(response.getBody())
//        );
//    }
//
//    @Test
//    @Order(3)
//    void read() {
//        String url = baseUrl + "/read/" + this.studentPrestige.getPrestigeId();
//        System.out.println(url);
//        ResponseEntity<StudentPrestige> response = this.restTemplate.getForEntity(url, StudentPrestige.class);
//        System.out.println(response);
//        assertAll(
//                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                () -> assertNotNull(response.getBody())
//        );
//    }
//
//    @Test
//    @Order(4)
//    void delete() {
//        String url = baseUrl + "/delete/" + this.studentPrestige.getPrestigeId();
//        this.restTemplate.delete(url);
//        System.out.println("Deleted Record! ");
//    }
//}