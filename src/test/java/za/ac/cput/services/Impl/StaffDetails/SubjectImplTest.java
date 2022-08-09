/* SubjectImplTest.java
Testing for SubjectImplTest
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/
package za.ac.cput.services.Impl.StaffDetails;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.StaffDetails.Subject;
import za.ac.cput.factory.StaffDetails.SubjectFactory;
import za.ac.cput.services.Interface.StaffDetails.ISubject;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SubjectImplTest {
    private Subject subject;
    @Autowired
    private ISubject service;
    @BeforeEach
    void setUp() {
        this.subject = SubjectFactory.createSubject("English",
                96,
                56);
        Subject save = this.service.save(this.subject);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.subject, save)
        );
    }
    @Test
    void findAll() {
        List<Subject> subjectList = this.service.findall();
        System.out.println(subjectList);
        assertEquals(1,subjectList.size());
    }
    @Test
    void save() {
        Subject save = this.service.save(this.subject);
        System.out.println(save);
        assertNotNull(save);
    }
    @Test
    void read() {
        Optional<Subject> read = this.service.read(this.subject.getSubjectID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.subject, read.get())
        );
    }
    @Test
    void delete() {
        Subject delete = this.service.save(this.subject);
        List<Subject> subjectList = this.service.findall();
        assertEquals(1,subjectList.size());
        System.out.println("Deleted!");
        this.service.delete(delete);
    }

}
