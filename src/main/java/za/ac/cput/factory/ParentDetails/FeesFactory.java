/*
FeesFactory.java
Factory for FeesFactory
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.factory.ParentDetails;

import za.ac.cput.domain.ParentDetails.Fees;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.ParentDetails.Parent;
import za.ac.cput.util.Helper;

public class FeesFactory {
    public static Fees build (String feeID, Student student, Admin admin, Parent parent, String amount) {

        Helper.isEmptyOrNull("feeID");
        Helper.isEmptyOrNull("studentID");
        Helper.isEmptyOrNull("adminId");
        Helper.isEmptyOrNull("parentID");
        Helper.isEmptyOrNull("amount");

        Helper.CheckStringParm("feeID", feeID);
        Helper.CheckStringParm("amount", amount);

        return new Fees.Builder()
                .setfeeID(feeID)
                .Student(student)
                .Admin(admin)
                .Parent(parent)
                .setAmount(amount)
                .build();

    }

}
