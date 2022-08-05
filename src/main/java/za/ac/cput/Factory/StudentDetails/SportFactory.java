//package za.ac.cput.Factory.StudentDetails;
//
//import za.ac.cput.Domain.StudentDetails.Sport;
//import za.ac.cput.util.Helper;
//
////Siyabonga Tumelo Masango
////219200815
////31/03/2022
////sportFactory.java
//public class SportFactory {
//
//    public static Sport createSport(String sportID, String  studentID, String teacherID, String performanceScore) {
//        if(Helper.isNotEmpty(sportID)|| Helper.isNotEmpty((studentID)) || Helper.isNotEmpty(teacherID)|| Helper.isNotEmpty(performanceScore))
//            return null;
//
//        return new Sport.Builder()
//                .setSportID(sportID)
//                .setStudentID(studentID)
//                .setTeacherID(teacherID).
//                setPerormanceScore(performanceScore)
//                .build();
//
//
//    }
//}