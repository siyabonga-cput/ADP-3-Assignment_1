package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.Admin;

import static org.junit.jupiter.api.Assertions.*;


//Siyabonga Tumelo Masango
//219200815
//31/03/2022
//sportFactory.java
class AdminFactoryTest {

    @Test
            public void test(){
        Admin admin = AdminFactory.createAdmin(
                "tt",
                "tumi");
        System.out.println(admin.toString());
        assertNotNull(admin);


    }


}