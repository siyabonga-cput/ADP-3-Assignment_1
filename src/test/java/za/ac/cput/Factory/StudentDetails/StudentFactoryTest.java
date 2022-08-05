package za.ac.cput.Factory.StudentDetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.StudentDetails.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {
    @Test
    public void BuildWithSuccess() {
        Student student = StudentFactory.createStudent("Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        assertNotNull(student);
        System.out.println(student);
    }

    @Test public void buildWithError() {
        Exception error = assertThrows(IllegalArgumentException.class, () ->
                StudentFactory.createStudent("Jack",
                        "Molten",
                        12,
                        "5th January 1999",
                        3345,
                        "",
                        "None",
                        54.6));
        String ExceptionMessage = error.getMessage();
        System.out.println(error);
        assertSame("Address Required!", ExceptionMessage);
    }
}