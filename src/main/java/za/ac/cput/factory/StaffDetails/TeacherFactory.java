/* TeacherFactory.java
Factory package for TeacherFactory
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.factory.StaffDetails;

import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.util.Helper;

public class TeacherFactory {
    public static Teacher build (String teacherID, String teachName, String teachSurname, String cellNum, String qualification, String importantInfo, String post, Admin admin){

        Helper.isEmptyOrNull("teacherID");
        Helper.isEmptyOrNull("teachName");
        Helper.isEmptyOrNull("teachSurname");
        Helper.isEmptyOrNull("cellNum");
        Helper.isEmptyOrNull("qualification");
        Helper.isEmptyOrNull("importantInfo");
        Helper.isEmptyOrNull("post");
        Helper.isEmptyOrNull("admin");

        Helper.CheckStringParm("teacherID",teacherID);
        Helper.CheckStringParm("teachName",teachName);
        Helper.CheckStringParm("teachSurname",teachSurname);
        Helper.CheckStringParm("cellNum",cellNum);
        Helper.CheckStringParm("qualification",qualification);
        Helper.CheckStringParm("importantInfo",importantInfo);
        Helper.CheckStringParm("post",post);


        return new Teacher.Builder()
                .setTeacherID(teacherID)
                .setTeachName(teachName)
                .setTeachSurname(teachSurname)
                .setCellNum(cellNum)
                .setQualification(qualification)
                .setImportantInfo(importantInfo)
                .setPost(post)
                .Admin(admin)
                .build();

    }
}
