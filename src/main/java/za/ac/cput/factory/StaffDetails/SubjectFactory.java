/* SubjectFactory.java
Factory package for SubjectFactory
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.factory.StaffDetails;

import za.ac.cput.domain.StaffDetails.Subject;
import za.ac.cput.util.Helper;

public class SubjectFactory {
    public static Subject createSubject(
                                        String modules,
                                        double subAverage,
                                        double stuAverage){

        String subjectID = Helper.generateID();
        Subject subject = new Subject.Builder().setSubjectID(subjectID)
                .setModules(modules)
                .setSubAverage(subAverage)
                .setStuAverage(stuAverage)
                .build();
        return subject;
    }

}
