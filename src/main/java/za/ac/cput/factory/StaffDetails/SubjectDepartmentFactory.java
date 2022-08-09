/* SubjectDepartmentFactory.java
   Factory class for SubjectDepartment
   Author: Raeesah Williams (219091498)
   Date: 1 April 2022
*/
package za.ac.cput.factory.StaffDetails;

import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import za.ac.cput.util.Helper;

public class SubjectDepartmentFactory
{
    public static SubjectDepartment createSubjectDepartment(String subjectID,
                                                            String typeSubject)
    {
        String subDeptID = Helper.generateSubDeptID();
        SubjectDepartment subjectDepartment = new SubjectDepartment.Builder().
                setSubDeptID(subDeptID).
                setTypeSubject(typeSubject).build();
        return subjectDepartment;
    }
}