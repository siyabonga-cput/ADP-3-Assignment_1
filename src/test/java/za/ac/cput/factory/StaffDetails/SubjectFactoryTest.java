/* SubjectFactoryTest.java
Test the SubjectFactory
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/
package za.ac.cput.factory.StaffDetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.StaffDetails.Subject;
import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.Admin.AdminFactory;
import za.ac.cput.factory.StudentDetails.StudentFactory;


import static org.junit.jupiter.api.Assertions.*;

class SubjectFactoryTest {
    @Test
    public void BuildWithSuccess() {
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        Teacher teacher = TeacherFactory.build(
                "36594",
                "Jimmy",
                "Beast",
                "039 359 1536",
                "Master degree",
                "None",
                "Government",
                admin);

        Student student = StudentFactory.Build(
                "2138532",
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);

        SubjectDepartment subjectDepartment = SubjectDepartmentFactory.Build("219091498",
                "Mathematics");

        Subject subject = SubjectFactory.build(
                "36259",
                "Math",
                56.30,
                65,
                subjectDepartment,
                student,
                teacher);
        assertNotNull(subject);
        System.out.println(subject);
    }

    @Test
    public void BuildWithError() {
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        Teacher teacher = TeacherFactory.build(
                "36594",
                "Jimmy",
                "Beast",
                "039 359 1536",
                "Master degree",
                "None",
                "Government",
                admin);

        Student student = StudentFactory.Build(
                "2138532",
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);

        SubjectDepartment subjectDepartment = SubjectDepartmentFactory.Build("219091498",
                "Mathematics");

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> SubjectFactory.build(
                        null,
                        "Math",
                        56.30,
                        65,
                        subjectDepartment,
                        student,
                        teacher));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Subject ID is required!", exceptionMessage);
    }
}