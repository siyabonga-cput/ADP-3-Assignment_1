///* ParentFactory.java
//Factory package for ParentFactory
//Author: Marvin Peter Hope (219445842)
//Date: 29 March 2022
//*/
//
//package za.ac.cput.Factory.ParentDetails;
//
//import za.ac.cput.Domain.ParentDetails.Parent;
//import za.ac.cput.util.Helper;
//public class ParentFactory {
//    public static Parent createParent(int studentID,
//                                      String parName,
//                                      String parSurname,
//                                      String cellNumber,
//                                      String email) {
//        String parentID = Helper.generateParentID();
//        Parent parent = new Parent.Builder().setParentID(parentID)
//                .setParName(parName).
//                setParSurname(parSurname).
//                setCellNumber(cellNumber).
//                setEmail(email).
//                build();
//        return parent;
//    }
//}
