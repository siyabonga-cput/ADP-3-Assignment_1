package za.ac.cput.services.Impl.Admin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.factory.Admin.AdminFactory;
import za.ac.cput.services.Interface.Admin.IAdmin;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdminImplTest {
    private Admin admin;
    @Autowired
    private IAdmin service;

    @BeforeEach
    void setUp(){
        this.admin = AdminFactory.createAdmin("45696 3244 54324");
        Admin save = this.service.save(this.admin);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.admin, save)
        );
    }

    @Test
    void findall() {
        List<Admin> adminList = this.service.findall();
        System.out.println(adminList);
        assertEquals(2, adminList.size());
    }

    @Test
    void save() {
        Admin save = this.service.save(this.admin);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    void read() {
        Optional<Admin> read = this.service.read(this.admin.getAdminID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.admin, read.get())
        );
    }

    @Test
    void delete() {
        Admin delete = this.service.save(this.admin);
        List<Admin> adminList = this.service.findall();
        assertEquals(1,adminList.size());
        System.out.println("Deleted!");
        this.service.delete(delete);
    }
}

