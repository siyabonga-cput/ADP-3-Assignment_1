//Siyabonga Tumelo Masango
//219200815
//31/03/2022
//sportFactory.java
package za.ac.cput.factory.StudentDetails;

import org.junit.jupiter.api.Test;

import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.domain.StudentDetails.Sport;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.Admin.AdminFactory;
import za.ac.cput.factory.StaffDetails.TeacherFactory;

import static org.junit.jupiter.api.Assertions.*;

class SportFactoryTest {
    @Test
    public void BuildWithSuccess() {
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
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        Teacher teacher = TeacherFactory.build("365241",
                "John",
                "Zack",
                "Degree in maths",
                "Masters degree",
                "none",
                "Government",
                admin);
        Sport sport = SportFactory.createSport("23452",student,teacher,"34.45%");
        assertNotNull(sport);
        System.out.println(sport);
    }
    @Test
    public void BuildWithFailure(){

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
        Admin admin = AdminFactory.createAdmin(
                "3245643",
                "45694 3244 54324");

        Teacher teacher = TeacherFactory.build("365241",
                "John",
                "Zack",
                "Degree in maths",
                "Masters degree",
                "none",
                "Government",
                admin);
        Exception error = assertThrows(IllegalArgumentException.class, () ->
                 SportFactory.createSport(null,student,teacher,"34.45%"));
        String ExceptionMessage = error.getMessage();
        System.out.println(error);
        assertSame("Sports ID Required!", ExceptionMessage);

    }
}