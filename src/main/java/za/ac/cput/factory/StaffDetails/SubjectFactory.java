/* SubjectFactory.java
Factory package for SubjectFactory
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.factory.StaffDetails;

import za.ac.cput.domain.StaffDetails.Subject;
import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.util.Helper;

public class SubjectFactory {
    public static Subject createSubject(String modules,
                                        SubjectDepartment supDep,
                                        Student student,
                                        double subAverage,
                                        double stuAverage){

        String subjectID = Helper.generateID();
        Subject subject = new Subject.Builder()
                .setSubjectID(subjectID)
                .setModules(modules)
                .setSubjectDepartment(supDep)
                .setStudentId(student)
                .setSubAverage(subAverage)
                .setStuAverage(stuAverage)
                .build();
        return subject;
    }
}
