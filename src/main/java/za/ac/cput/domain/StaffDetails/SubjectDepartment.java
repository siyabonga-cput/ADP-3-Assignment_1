/* SubjectDepartment.java
   Entity for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 30 March 2022
*/

package za.ac.cput.domain.StaffDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class SubjectDepartment
{
    // constructors
    @NotNull @Id
    public String subDeptID;
//    public String subjectID;
//    public String teacherID;
    private String typeSubject;

    protected SubjectDepartment(){

    }

    // getters
    public String getSubDeptID()
    {
        return subDeptID;
    }

//    public String getSubjectID()
//    {
//        return subjectID;
//    }
//
//    public String getTeacherID()
//    {
//        return teacherID;
//    }

    public String getTypeSubject()
    {
        return typeSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectDepartment that = (SubjectDepartment) o;
        return subDeptID.equals(that.subDeptID) && typeSubject.equals(that.typeSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subDeptID, typeSubject);
    }

    // toString


    @Override
    public String toString() {
        return "SubjectDepartment{" +
                "subDeptID='" + subDeptID + '\'' +
                ", typeSubject='" + typeSubject + '\'' +
                '}';
    }

    // private constructors
    private SubjectDepartment (Builder builder)
    {
        this.subDeptID = builder.subDeptID;
//        this.subjectID = builder.subjectID;
//        this.teacherID = builder.teacherID;
        this.typeSubject = builder.typeSubject;
    }

    // builder pattern
    public static class Builder
    {
        private String subDeptID;
//        private String subjectID;
//        private String teacherID;
        private String typeSubject;

        public SubjectDepartment.Builder setSubDeptID(String subDeptID)
        {
            this.subDeptID = subDeptID;
            return this;
        }

//        public SubjectDepartment.Builder setSubjectID(String subjectID)
//        {
//            this.subjectID = subjectID;
//            return this;
//        }
//
//        public SubjectDepartment.Builder setTeacherID(String teacherID)
//        {
//            this.teacherID = teacherID;
//            return this;
//        }

        public Builder setTypeSubject(String typeSubject)
        {
            this.typeSubject = typeSubject;
            return this;
        }

        public Builder copy(SubjectDepartment subjectDepartment)
        {
            this.subDeptID = subjectDepartment.getSubDeptID();
//            this.subjectID = subjectDepartment.getSubjectID();
//            this.teacherID = subjectDepartment.getTeacherID();
            this.typeSubject = subjectDepartment.getTypeSubject();
            return this;
        }
        public SubjectDepartment build()
        {
            return new SubjectDepartment(this);
        }
    }
}
