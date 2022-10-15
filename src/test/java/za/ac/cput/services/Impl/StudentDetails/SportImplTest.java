package za.ac.cput.services.Impl.StudentDetails;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.domain.StudentDetails.Sport;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.Admin.AdminFactory;
import za.ac.cput.factory.StaffDetails.TeacherFactory;
import za.ac.cput.factory.StudentDetails.SportFactory;
import za.ac.cput.factory.StudentDetails.StudentFactory;
import za.ac.cput.services.Interface.StudentDetails.ISport;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SportImplTest {
    private Student student;
    private Teacher teacher;
    private Sport sport;
    private Admin admin;

    @Autowired
    private ISport service;

    @BeforeEach
    void setUp() {
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
       this.admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        this.teacher = TeacherFactory.build("365241",
                "John",
                "Zack",
                "Degree in maths",
                "Masters degree",
                "none",
                "Government",
                admin);
        this.sport = SportFactory.createSport("23452",
                student,
                teacher,
                "34.45%");
        Sport save = this.service.save(this.sport);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.sport, save)
        );
    }
    @Test
    @Order(1)
    void findAll() {
        List<Sport> sportList = this.service.findAll();
        System.out.println(sportList);
        assertEquals(1,sportList.size());
    }
    @Test
    @Order(2)
    void save() {
        Sport save = this.service.save(this.sport);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    @Order(3)
    void read() {
        Optional<Sport> read = this.service.read(this.sport.getSportID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.sport, read.get())
        );
    }

    @Test
    @Order(4)
    void delete() {
        Sport delete = this.service.save(this.sport);
        List<Sport> sportList = this.service.findAll();
        assertEquals(1,sportList.size());
        System.out.println("Deleted!");
        this.service.delete(delete);
    }
}