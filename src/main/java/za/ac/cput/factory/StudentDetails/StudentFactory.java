/* StudentFactory.java
Factory package for StudentFactory
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/

package za.ac.cput.factory.StudentDetails;

import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.util.Helper;

public class StudentFactory {
    public static Student createStudent(
                                        String stuName,
                                        String stuSurname,
                                        int grade,
                                        String dob,
                                        int idNumber,
                                        String address,
                                        String importantHealthInfo,
                                        double stuAverage) {
        String studentID = Helper.generateStudentID();
        Student student = new Student.Builder().setStudentID(studentID).
                setStuName(stuName).
                setStuSurname(stuSurname).
                setGrade(grade).
                setDob(dob).
                setIdNumber(idNumber).
                setAddress(address).
                setImportantHealthInfo(importantHealthInfo).
                setStuAverage(stuAverage).
                build();
        return student;
    }
}