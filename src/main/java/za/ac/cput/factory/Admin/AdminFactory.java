//Siyabonga Tumelo Masango
//219200815
//31/03/2022
//AdminFactory.java

package za.ac.cput.factory.Admin;

import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.util.Helper;
public class AdminFactory {
    public static Admin createAdmin(
                  String AdminID,
                  String bankingID) {

        Helper.isEmptyOrNull("AdminID");
        Helper.isEmptyOrNull("bankingID");

        Helper.CheckStringParm("AdminID",AdminID);
        Helper.CheckStringParm("bankingID",bankingID);

       return new Admin.Builder()
                .setAdminID(AdminID)
                .setBankingID(bankingID)
                .build();
    }
}

