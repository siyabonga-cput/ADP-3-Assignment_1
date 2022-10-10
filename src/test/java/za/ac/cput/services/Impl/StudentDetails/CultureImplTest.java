/*  CultureImplTest.java
    Culture services Tests
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
 */

package za.ac.cput.services.Impl.StudentDetails;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.StudentDetails.Culture;
import za.ac.cput.services.Interface.StudentDetails.ICulture;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CultureImplTest {
    private Culture culture;
    @Autowired private ICulture service;

    @Test
    @Order(1)
    void findAll() {
        List<Culture> cultureList = this.service.findAll();
        System.out.println(cultureList);
        assertEquals(1,cultureList.size());
    }

    @Test
    @Order(2)
    void save() {
        Culture save = this.service.save(this.culture);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    @Order(3)
    void read() {
        Optional<Culture> read = this.service.read(this.culture.getCultureId());
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()-> assertSame(this.culture, read.get())
        );
    }

    @Test
    @Order(4)
    void delete() {
        this.service.delete(this.culture);
    }
}