/*  StudentPrestigeFactoryTest.java
    StudentPrestigeFactory Tests
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
 */

package za.ac.cput.factory.studentdetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.admin.Admin;
import za.ac.cput.domain.staffdetails.Subject;
import za.ac.cput.domain.staffdetails.SubjectDepartment;
import za.ac.cput.domain.staffdetails.Teacher;
import za.ac.cput.domain.studentdetails.Culture;
import za.ac.cput.domain.studentdetails.Sport;
import za.ac.cput.domain.studentdetails.Student;
import za.ac.cput.domain.studentdetails.StudentPrestige;
import za.ac.cput.factory.admin.AdminFactory;
import za.ac.cput.factory.staffdetails.SubjectDepartmentFactory;
import za.ac.cput.factory.staffdetails.SubjectFactory;
import za.ac.cput.factory.staffdetails.TeacherFactory;

import static org.junit.jupiter.api.Assertions.*;


class StudentPrestigeFactoryTest {

    @Test
    public void buildWithSuccess() {
        Student student = StudentFactory.Build("2138532",
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        Teacher teacher = TeacherFactory.build("36594",
                "Jimmy",
                "Beast",
                "039 359 1536",
                "Master degree",
                "None",
                "Government",
                admin);
        Sport sport = SportFactory.createSport("05",
                student,
                teacher,
                "85");
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
        Culture culture = CultureFactory.build("01",
                "Dance",
                student);
        StudentPrestige studentPrestige = StudentPrestigeFactory.build("01",
                "Certificate",
                student,
                sport,
                culture,
                subject);
        assertNotNull(studentPrestige);
        System.out.println(studentPrestige);
    }
    @Test
    public void buildWithError(){
        Student student = StudentFactory.Build("2138532",
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        Teacher teacher = TeacherFactory.build("36594",
                "Jimmy",
                "Beast",
                "039 359 1536",
                "Master degree",
                "None",
                "Government",
                admin);
        Sport sport = SportFactory.createSport("05",
                student,
                teacher,
                "85");
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
        Culture culture = CultureFactory.build("01",
                "Dance",
                student);
        Exception error = assertThrows(IllegalArgumentException.class, () -> StudentPrestigeFactory.build(null,
                "Certificate",
                student,
                sport,
                culture,
                subject));
        String ExceptionMessage = error.getMessage();
        System.out.println(error);
        assertSame("Prestige ID Required!", ExceptionMessage);
    }
}