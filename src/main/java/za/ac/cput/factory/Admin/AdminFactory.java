//Siyabonga Tumelo Masango
//219200815
//31/03/2022
//AdminFactory.java

package za.ac.cput.factory.Admin;

import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.ParentDetails.Parent;
import za.ac.cput.util.Helper;
public class AdminFactory {
    public static Admin createAdmin(
            String bankingID) {
        String AdminID = Helper.generateAdminId();
        Admin admin = new Admin.Builder()
                .setAdminID(AdminID)
                .setBankingID(bankingID)
                .build();
        return admin;
    }
}

