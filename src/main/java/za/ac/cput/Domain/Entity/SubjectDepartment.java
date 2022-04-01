/* SubjectDepartment.java
   Entity for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 30 March 2022
*/

package za.ac.cput.Domain.Entity;

public class SubjectDepartment
{
    // constructors
    private int subDeptID;
    private int subjectID;
    private int teacherID;
    private String typeOfDepartment;

    // getters and setters
    public int getSubDeptID()
    {
        return subDeptID;
    }

    public int getSubjectID()
    {
        return subjectID;
    }

    public int getTeacherID()
    {
        return teacherID;
    }

    public String getTypeOfDepartment()
    {
        return typeOfDepartment;
    }

    public void setSubDeptID(int subDeptID) {
        this.subDeptID = subDeptID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public void setTypeOfDepartment(String typeOfDepartment) {
        this.typeOfDepartment = typeOfDepartment;
    }

    // toString
    @Override
    public String toString()
    {
        return "SubjectDepartment{" +
                "subDeptID=" + subDeptID +
                ", subjectID=" + subjectID +
                ", teacherID=" + teacherID +
                ", typeOfTransport='" + typeOfDepartment + '\'' +
                '}';
    }

    // private constructors
    private SubjectDepartment (Builder builder)
    {
        this.subDeptID = builder.subDeptID;
        this.subjectID = builder.subjectID;
        this.teacherID = builder.teacherID;
        this.typeOfDepartment = builder.typeOfDepartment;
    }

    // builder pattern
    public static class Builder
    {
        private int subDeptID;
        private int subjectID;
        private int teacherID;
        private String typeOfDepartment;

        public Builder setSubDeptID(int subDeptID)
        {
            this.subDeptID = subDeptID;
            return this;
        }

        public Builder setSubjectID(int subjectID)
        {
            this.subjectID = subjectID;
            return this;
        }

        public Builder setTeacherID(int teacherID)
        {
            this.teacherID = teacherID;
            return this;
        }

        public Builder setTypeOfDepartment(String typeOfDepartment)
        {
            this.typeOfDepartment = typeOfDepartment;
            return this;
        }

        public Builder copy(SubjectDepartment subjectDepartment)
        {
            this.subDeptID = subjectDepartment.getSubDeptID();
            this.subjectID = subjectDepartment.getSubjectID();
            this.teacherID = subjectDepartment.getTeacherID();
            this.typeOfDepartment = subjectDepartment.getTypeOfDepartment();
            return this;
        }

        public SubjectDepartment build()
        {
            return new SubjectDepartment(this);
        }
    }
}
