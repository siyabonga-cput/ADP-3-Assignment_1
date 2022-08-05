package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.Sport;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class SportFactoryTest {

    //Siyabonga Tumelo Masango
//219200815
//31/03/2022
//sportFactory.java
@Test

    public void test() {
    Sport sport = SportFactory.createSport(
            "tumi",
            "nesh",
                       "money",
                   "rooney"

    );
    System.out.println(sport.toString());
    assertNotNull(sport);
    }

    }