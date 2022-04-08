/*
SupportStaff.java
Factory package for SupportStaffFactory
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.Factory;

import za.ac.cput.Domain.Entity.SupportStaff;
import za.ac.cput.util.Helper;

public class SupportStaffFactory {
    public static SupportStaff createSupportStaff(int adminID, String suppStaffName,
                                                  String suppStaffSurname, int cellNumber,
                                                  String importHealthInfo, String qualification,
                                                  String typeOfWork) {
        String suppStaffID = Helper.generateSupportStaffID();

        SupportStaff supportStaff = new SupportStaff.Builder().setSuppStaffID(suppStaffID).
                setAdminID(adminID).
                setSuppStaffName(suppStaffName).
                setSuppStaffSurname(suppStaffSurname).
                setCellNumber(cellNumber).
                setImportHealthInfo(importHealthInfo).
                setQualification(qualification).
                setTypeOfWork(typeOfWork).build();
        return supportStaff;
    }
}
