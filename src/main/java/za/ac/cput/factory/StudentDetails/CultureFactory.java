///* CultureFactory.java
//    Factory for Culture
//    Author: Kegomoditswe Leshope - 219189048
//    Date: 28 March 2022
//*/
//package za.ac.cput.Factory.StudentDetails;
//
//import za.ac.cput.Domain.StudentDetails.Culture;
//import za.ac.cput.util.Helper;
//
//public class CultureFactory {
//    public static Culture createCulture(int studentId, String cultureType){
//        String cultureId = Helper.generateId();
//        Culture culture = new Culture.Builder().setCultureId(cultureId)
//                .setStudentId(studentId)
//                .setCultureType(cultureType)
//                .build();
//        return culture;
//    }
//}
