/*  CultureFactoryTest.java
    CultureFactory Tests
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
 */

package za.ac.cput.factory.studentdetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.studentdetails.Culture;
import za.ac.cput.domain.studentdetails.Student;


import static org.junit.jupiter.api.Assertions.*;

class CultureFactoryTest {

    @Test
    void buildWithSuccess() {
        Student student = StudentFactory.Build("2138532",
                "Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        Culture culture = CultureFactory.build("01",
                "Dance",student);
        System.out.println(culture);
        assertNotNull(culture);
    }

    @Test
    void buildWithError(){
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
        Exception exception = assertThrows(IllegalArgumentException.class,() ->
                CultureFactory.build(null,
                        "Dance",
                        student));
        String ExceptionMessage = exception.getMessage();
        System.out.println(exception);
        assertSame("CultureId is required",ExceptionMessage);

    }
}