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
}