/* SubjectFactory.java
Factory package for SubjectFactory
Author: Jayden Johnson (219086796)
Date: 31 March 2022
*/

package za.ac.cput.Factory;

import za.ac.cput.Domain.Entity.Subject;
import za.ac.cput.util.Helper;

public class SubjectFactory {
    public static Subject createSubject(String studentID,
                                        String subDeptID,
                                        String modules,
                                        double subAverage,
                                        double stuAverage){

        String subjectID = Helper.generateID();
        Subject subject = new Subject.Builder().setSubjectID(subjectID)
                .setStudentID(studentID)
                .setSubDeptID(subDeptID)
                .setModules(modules)
                .setSubAverage(subAverage)
                .setStuAverage(stuAverage)
                .build();
        return subject;
    }

}
