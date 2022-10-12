/*
SupportStaffImplTest.java
Test for SupportStaffImpl
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.controller.Impl.StaffDetails;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.StaffDetails.SupportStaff;
import za.ac.cput.factory.StaffDetails.SupportStaffFactory;
import za.ac.cput.services.Interface.StaffDetails.ISupportStaff;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SupportStaffImplTest {
    private SupportStaff supportStaff;

    @Autowired private ISupportStaff services;
    @BeforeEach
    void setUp() {
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

        SupportStaff save = this.services.save(this.supportStaff);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.supportStaff, save)
        );
    }

    @Test
    @Order(1)
    void findAll() {
        List<SupportStaff> supportStaffList = this.services.findall();
        System.out.println(supportStaffList);
        assertEquals(1, supportStaffList.size());
    }

    @Test
    @Order(2)
    void save() {
        SupportStaff save = this.services.save(this.supportStaff);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    @Order(3)
    void read() {
        Optional<SupportStaff> read = this.services.read(this.supportStaff.getSuppStaffID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.supportStaff, read.get())
        );
    }

    @Test
    @Order(4)
    void delete(0) {
        SupportStaff delete = this.services.save(this.supportStaff);
        List<SupportStaff> supportStaffList = this.services.findall();
        assertEquals(1, supportStaffList());
        System.out.println("Deleted");
        this.services.delete(delete);
    }

}

