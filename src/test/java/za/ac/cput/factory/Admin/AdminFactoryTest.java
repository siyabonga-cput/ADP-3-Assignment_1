package za.ac.cput.factory.Admin;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.factory.ParentDetails.FeesFactory;

import static org.junit.jupiter.api.Assertions.*;

class AdminFactoryTest {

    @Test
    public void BuildWithSuccess() {
        Admin admin = AdminFactory.createAdmin("45694 3244 54324");
        assertNotNull(admin);
        System.out.println(admin);

    }
    @Test
    public void BuildWithFailure() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> AdminFactory.createAdmin(
                        null));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Banking ID is required!", exceptionMessage);
    }
}