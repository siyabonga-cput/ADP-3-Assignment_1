/* SubjectDepartment.java
   Entity for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 30 March 2022
*/

package za.ac.cput.domain.StaffDetails;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Objects;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

@Entity
public class SubjectDepartment
{
    @NotNull @Id
    private String subDeptID;
    @ManyToOne(cascade = {PERSIST, MERGE})
    @NotFound(action = NotFoundAction.IGNORE)
    public Teacher teacherID;

    @NotNull
    private String typeSubject;

    protected SubjectDepartment(){
    }
    // constructors
    private SubjectDepartment (Builder builder)
    {
        this.subDeptID = builder.subDeptID;
        this.teacherID = builder.teacherID;
        this.typeSubject = builder.typeSubject;
    }


    // private constructors
    public String getSubDeptID() {
        return subDeptID;
    }


    public Teacher getTeacherID() {
        return teacherID;
    }

    public String getTypeSubject() {
        return typeSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectDepartment that = (SubjectDepartment) o;
        return subDeptID.equals(that.subDeptID) && teacherID.equals(that.teacherID) && typeSubject.equals(that.typeSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subDeptID, teacherID, typeSubject);
    }

    // toString
    @Override
    public String toString() {
        return "SubjectDepartment{" +
                "subDeptID='" + subDeptID + '\'' +
                ", teacherID=" + teacherID +
                ", typeSubject='" + typeSubject + '\'' +
                '}';
    }

    // builder pattern
    public static class Builder
    {
        private String subDeptID;

        private Teacher teacherID;
        private String typeSubject;

        public SubjectDepartment.Builder setSubDeptID(String subDeptID)
        {
            this.subDeptID = subDeptID;
            return this;
        }

        public SubjectDepartment.Builder setTeacherID(Teacher teacherID)
        {
            this.teacherID = teacherID;
            return this;
        }
        public Builder setTypeSubject(String typeSubject)
        {
            this.typeSubject = typeSubject;
            return this;
        }

        public Builder copy(SubjectDepartment subjectDepartment)
        {
            this.subDeptID = subjectDepartment.getSubDeptID();
            this.teacherID = subjectDepartment.getTeacherID();
            this.typeSubject = subjectDepartment.getTypeSubject();
            return this;
        }
        public SubjectDepartment build()
        {
            return new SubjectDepartment(this);
        }
    }
}
