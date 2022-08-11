/*
FeesFactory.java
Factory for FeesFactory
Author: Tiffany Kiwiets (219322732)
 */

//// You just require admins ID

package za.ac.cput.factory.ParentDetails;

import za.ac.cput.domain.ParentDetails.Fees;
import za.ac.cput.domain.StudentDetails.Student;

import za.ac.cput.domain.ParentDetails.Parent;
import za.ac.cput.util.Helper;

public class FeesFactory {
    public static Fees createFees(
                                  Student studentID,
                                  Parent parentID,
                                  double amount) {
        String feeID = Helper.generateFeesID();
        Fees fees = new Fees.Builder().
                setfeeID(feeID).
                setStudentID(studentID).
                setParentID(parentID).
                setAmount(amount).build();
        return fees;
    }
}
