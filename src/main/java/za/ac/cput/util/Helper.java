package za.ac.cput.util;

import java.util.UUID;

public class Helper {
    //====================================================
    //Marvin Hope
    //Generating a primary key for StudentID
    public static String generateStudentID() {
        return UUID.randomUUID().toString();
    }
    //Generating a primary key for ParentID
    public static String generateParentID() {
        return UUID.randomUUID().toString();
    }
    //====================================================

    //Tiffany Kiwiets (219327732) Code for generating a primary key for feesID and supportStaffID
    public static String generateFeesID() {
        return UUID.randomUUID().toString();
    }

    public static String generateSupportStaffID() {
        return UUID.randomUUID().toString();
    }
}