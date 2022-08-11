///*
//SupportStaff.java
//Factory for SupportStaffFactory
//Author: Tiffany Kiwiets (219322732)
//*/
//
//package za.ac.cput.factory.StaffDetails;
//
//import za.ac.cput.domain.StaffDetails.SupportStaff;
//import za.ac.cput.domain.Admin.Admin;
//import za.ac.cput.util.Helper;
//
//public class SupportStaffFactory {
//    public static SupportStaff createSupportStaff(int adminID, String suppStaffName,
//                                                  String suppStaffSurname, int cellNumber,
//                                                  String importHealthInfo, String qualification,
//                                                  String typeOfWork) {
//        String suppStaffID = Helper.generateSupportStaffID();
//
//        SupportStaff supportStaff = new SupportStaff.Builder().setSuppStaffID(suppStaffID).
//                setAdminID(adminID).
//                setSuppStaffName(suppStaffName).
//                setSuppStaffSurname(suppStaffSurname).
//                setCellNumber(cellNumber).
//                setImportHealthInfo(importHealthInfo).
//                setQualification(qualification).
//                setTypeOfWork(typeOfWork).build();
//        return supportStaff;
//    }
//}
