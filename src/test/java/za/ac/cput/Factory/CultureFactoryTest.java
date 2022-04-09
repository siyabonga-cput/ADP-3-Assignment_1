package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.Culture;

import static org.junit.jupiter.api.Assertions.*;

class CultureFactoryTest {

    @Test
    void createCulture() {
        Culture culture = CultureFactory.createCulture(219189048,"Debate");
        assertNotNull(culture);
        System.out.println(culture);
    }
}