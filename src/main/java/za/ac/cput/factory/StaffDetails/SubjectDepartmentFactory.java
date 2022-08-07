///* SubjectDepartmentFactory.java
//   Factory class for SubjectDepartment
//   Author: Raeesah Williams (219091498)
//   Date: 1 April 2022
//*/
//package za.ac.cput.Factory.StaffDetails;
//
//import za.ac.cput.Domain.StaffDetails.SubjectDepartment;
//import za.ac.cput.util.Helper;
//public class SubjectDepartmentFactory
//{
//    public static SubjectDepartment createSubjectDepartment(String subjectID,
//                                                            String teacherID,
//                                                            String typeOfDepartment)
//    {
//        String subDeptID = Helper.generateSubDeptID();
//        SubjectDepartment subjectDepartment = new SubjectDepartment.Builder().
//                setSubDeptID(subDeptID).
//                setSubjectID(subjectID).
//                setTeacherID(teacherID).
//                setTypeOfDepartment(typeOfDepartment).build();
//        return subjectDepartment;
//    }
//
//}
