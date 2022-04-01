/* SubjectDepartmentFactory.java
   Factory class for SubjectDepartment
   Author: Raeesah Williams (219091498)
   Date: 1 April 2022
*/
package za.ac.cput.Factory;

import za.ac.cput.Domain.Entity.SubjectDepartment;
import za.ac.cput.util.Helper;

public class SubjectDepartmentFactory
{
    public static SubjectDepartment createSubjectDepartment(int subjectID,
                                                            int teacherID,
                                                            String typeOfDepartment)
    {
        String subDeptID = Helper.generateSubDeptID();
        SubjectDepartment subjectDepartment = new SubjectDepartment.Builder().
                setSubDeptID(Integer.parseInt(subDeptID)).
                setSubjectID(subjectID).
                setTeacherID(teacherID).
                setTypeOfDepartment(typeOfDepartment).build();
        return subjectDepartment;
    }

}
