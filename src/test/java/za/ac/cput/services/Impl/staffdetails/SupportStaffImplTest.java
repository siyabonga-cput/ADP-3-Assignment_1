package za.ac.cput.services.Impl.staffdetails;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.admin.Admin;
import za.ac.cput.domain.staffdetails.SupportStaff;
import za.ac.cput.factory.admin.AdminFactory;
import za.ac.cput.factory.staffdetails.SupportStaffFactory;
import za.ac.cput.services.Interface.staffdetails.ISupportStaff;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SupportStaffImplTest {
    private Admin admin;
    private SupportStaff supportStaff;

    @Autowired private ISupportStaff service;

    @BeforeEach
    void setUp() {
        this.admin = AdminFactory.createAdmin(
                "3245643",
                "45696 3244 54324");
        this.supportStaff = SupportStaffFactory.build(
                "635941258",
                "Julius",
                "Jacob",
                "08569112567",
                "Allegic to bees",
                "Degree in sport management",
                "Head of sports management",
                admin);
        SupportStaff save = this.service.save(this.supportStaff);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.supportStaff, save)
        );
    }

    @Test
    @Order(1)
    void findall() {
        List<SupportStaff> supportStaffsist = this.service.findall();
        System.out.println(supportStaffsist);
        assertEquals(1,supportStaffsist.size());
    }

    @Test
    @Order(2)
    void save() {
        SupportStaff save = this.service.save(this.supportStaff);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    @Order(3)
    void read() {
        Optional<SupportStaff> read = this.service.read(this.supportStaff.getSuppStaffID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.supportStaff, read.get())
        );
    }

    @Test
    @Order(4)
    void delete() {
        SupportStaff delete = this.service.save(this.supportStaff);
        List<SupportStaff> supportStaffsList = this.service.findall();
        assertEquals(1,supportStaffsList.size());
        System.out.println("Deleted! ");
        this.service.delete(delete);
    }
}