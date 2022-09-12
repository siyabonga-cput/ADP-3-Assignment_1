/* ParentImplTest.java
Testing for ParentImplTest
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/
package za.ac.cput.services.Impl.ParentDetails;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.ParentDetails.Parent;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.ParentDetails.ParentFactory;
import za.ac.cput.factory.StudentDetails.StudentFactory;
import za.ac.cput.services.Interface.ParentDetails.IParent;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ParentImplTest {
    private Student student;
    private Parent parent;

    @Autowired private IParent service;
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
        Parent save = this.service.save(this.parent);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.parent, save)
        );
    }
    @Test
    void findAll() {
        List<Parent> parentList = this.service.findall();
        System.out.println(parentList);
        assertEquals(1,parentList.size());
    }

    @Test
    void save() {
        Parent save = this.service.save(this.parent);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    void read() {
        Optional<Parent> read = this.service.read(this.parent.getParentID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.parent, read.get())
        );
    }

    @Test
    void delete() {
        Parent delete = this.service.save(this.parent);
        List<Parent> employeeList = this.service.findall();
        assertEquals(1,employeeList.size());
        System.out.println("Deleted! ");
        this.service.delete(delete);
    }
}