package za.ac.cput.services.Impl.ParentDetails;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.ParentDetails.Fees;
import za.ac.cput.domain.ParentDetails.Parent;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.ParentDetails.FeesFactory;
import za.ac.cput.factory.ParentDetails.ParentFactory;
import za.ac.cput.factory.StudentDetails.StudentFactory;
import za.ac.cput.services.Interface.ParentDetails.IFees;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FeesImplTest {
    private Student student;
    private Parent parent;
    private Fees fees;
    @Autowired private IFees services;
    @BeforeEach
    void setUp() {
        this.student = StudentFactory.createStudent("Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        this.parent = ParentFactory.createParent(student,
                "John",
                "Molten",
                "073 697 1537",
                "johnmolton12@gmail.com");
        this.fees = FeesFactory.createFees(
                student,
                parent,
                20000.00);
        Fees save = this.services.save(this.fees);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.fees, save)
        );
    }

    @Test
    void findall() {
        List<Fees> feesList = this.services.findall();
        System.out.println(feesList);
        assertEquals(2, feesList.size());
    }

    @Test
    void save() {
        Fees save = this.services.save(this.fees);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    void read() {
        Optional<Fees> read = this.services.read(this.fees.getFeeID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.fees, read.get())
        );
    }

    @Test
    void delete() {
        Fees delete = this.services.save(this.fees);
        List<Fees> feesList = this.services.findall();
        assertEquals(1,feesList.size());
        System.out.println("Deleted!");
        this.services.delete(delete);
    }
}