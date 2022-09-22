///* SubjectDepartmentFactoryTest.java
//   Test class for SubjectDepartment
//   Author: Raeesah Williams (219091498)
//   Date: 06 April 2022
//*/
//package za.ac.cput.factory.StaffDetails;
//
//import org.junit.jupiter.api.Test;
//import za.ac.cput.domain.StaffDetails.SubjectDepartment;
//import za.ac.cput.domain.StaffDetails.Teacher;
//import za.ac.cput.domain.StudentDetails.Student;
//import za.ac.cput.factory.StudentDetails.StudentFactory;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//class SubjectDepartmentFactoryTest {
//
//    @Test
//    void createSubjectDepartment()
//    {
//        Student student = StudentFactory.createStudent("Jack",
//                "Molten",
//                12,
//                "5th January 1999",
//                3345,
//                "14 Hope Street Cape Town",
//                "None",
//                54.6);
//        Teacher teacher = TeacherFactory.createTeacher("",
//                "John",
//                "072 456 6783",
//                "Degree in maths",
//                "None",
//                "Maths teacher",
//                student);
//        SubjectDepartment subjectDepartment = SubjectDepartmentFactory.createSubjectDepartment(
//                teacher,
//                "Pure Maths");
//
//        assertNotNull(subjectDepartment);
//        System.out.println(subjectDepartment);
//    }
//}