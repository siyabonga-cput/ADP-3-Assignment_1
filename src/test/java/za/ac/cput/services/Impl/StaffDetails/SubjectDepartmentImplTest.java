package za.ac.cput.services.Impl.StaffDetails;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import za.ac.cput.services.Interface.StaffDetails.ISubjectDepartment;
import za.ac.cput.factory.StaffDetails.SubjectDepartmentFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SubjectDepartmentImplTest
{
    private SubjectDepartment subjectDepartment;

    @Autowired
    private ISubjectDepartment service;

    @BeforeEach
    void setUp()
    {
        this.subjectDepartment = SubjectDepartmentFactory.createSubjectDepartment("56th","Math");
        SubjectDepartment save = this.service.save(this.subjectDepartment);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.subjectDepartment, save)
        );
    }

    @Test
    void findAll()
    {
        List<SubjectDepartment> subjectDepartmentList = this.service.findAll();
        System.out.println(subjectDepartmentList);
        assertEquals(1, subjectDepartmentList.size());
    }

    @Test
    void save()
    {
        SubjectDepartment save = this.service.save(this.subjectDepartment);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    void read()
    {
        Optional<SubjectDepartment> read = this.service.read(this.subjectDepartment.getSubDeptID());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.subjectDepartment, read.get())
        );
    }

    @Test
    void delete()
    {
        SubjectDepartment delete = this.service.save(this.subjectDepartment);
        List<SubjectDepartment> subjectDepartmentList = this.service.findAll();
        assertEquals(1, subjectDepartmentList.size());
        System.out.println("Deleted");
        this.service.delete(delete);
    }
}