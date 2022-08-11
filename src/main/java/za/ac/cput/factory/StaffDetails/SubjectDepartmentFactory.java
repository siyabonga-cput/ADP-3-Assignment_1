/* SubjectDepartmentFactory.java
   Factory class for SubjectDepartment
   Author: Raeesah Williams (219091498)
   Date: 1 April 2022
*/
package za.ac.cput.factory.StaffDetails;

import za.ac.cput.domain.StaffDetails.Subject;
import za.ac.cput.domain.StaffDetails.SubjectDepartment;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.util.Helper;

public class SubjectDepartmentFactory
{
    public static SubjectDepartment createSubjectDepartment( Teacher teacher,
                                                            String typeSubject)
    {
        String subDeptID = Helper.generateSubDeptID();
        SubjectDepartment subjectDepartment = new SubjectDepartment.Builder().
                setSubDeptID(subDeptID).
                setTeacherID(teacher).
                setTypeSubject(typeSubject).build();
        return subjectDepartment;
    }
}