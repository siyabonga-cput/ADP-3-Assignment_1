/*
FeesFactory.java
Factory package for FeesFactory
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.Factory;

import za.ac.cput.Domain.Entity.Fees;
import za.ac.cput.util.Helper;

public class FeesFactory {
    public static Fees createFees(int studentID, int adminID,
                                  int parentID, double amount) {
        String feeID = Helper.generateFeesID();

        Fees fees = new Fees.Builder().setfeeID(feeID).
                setStudentID(studentID).
                setAdminID(adminID).
                setParentID(parentID).
                setAmount(amount).build();
        return fees;
    }
}
