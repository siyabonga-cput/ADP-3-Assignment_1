/* TeacherFactory.java
Factory package for TeacherFactory
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.factory.StaffDetails;

import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.util.Helper;

public class TeacherFactory {
    public static Teacher createTeacher(
                                        String teachName,
                                        String teachSurname,
                                        String cellNum,
                                        String qualification,
                                        String importantInfo,
                                        String post){

        String teacherID = Helper.generateID();
        Teacher teacher = new Teacher.Builder().setTeacherID(teacherID)
                .setTeachName(teachName)
                .setTeachSurname(teachSurname)
                .setCellNum(cellNum)
                .setQualification(qualification)
                .setImportantInfo(importantInfo)
                .setPost(post)
                .build();
        return teacher;
    }
}
