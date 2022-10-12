/* TransportControllerTest.java
   Controller Test for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 07 October 2022
*/

package za.ac.cput.controller.StudentDetails;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.StudentDetails.Transport;
import za.ac.cput.factory.StudentDetails.TransportFactory;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TransportControllerTest
{
    @LocalServerPort
    private int port;
    @Autowired
    private TransportController Controller;
    @Autowired
    private TestRestTemplate restTemplate;
    private Transport transport;
    private String baseUrl;

    @BeforeEach
    void setUp()
    {
        assertNotNull(Controller);
        this.transport = TransportFactory.Build(
                "219091498",
                "Bus");
        this.baseUrl = "http://localhost:" + this.port + "/abc-school-management/student";
    }

    @Test
    @Order(1)
    void findAll() {
        String url = baseUrl + "/all";
        System.out.println(url);
        ResponseEntity<Transport[]> response =
                this.restTemplate.getForEntity(url, Transport[].class);
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
        ResponseEntity<Transport> response = this.restTemplate.postForEntity(url, this.transport, Transport.class);
        System.out.println(response);
        assertAll (
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(3)
    void read() {
        String url = baseUrl + "/read/" + this.transport.getTransportID();
        System.out.println(url);
        ResponseEntity<Transport> response = this.restTemplate.getForEntity(url, Transport.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(4)
    void delete() {
        String url = baseUrl + "/delete/" + this.transport.getTransportID();
        this.restTemplate.delete(url);
        System.out.println("Record Deleted");
    }
}