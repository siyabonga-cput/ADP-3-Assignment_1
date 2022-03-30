/*

 */

package za.ac.cput.Domain.Entity;

public class SubjectDepartment
{
    // constructors
    private int subDeptID;
    private int subjectID;
    private int teacherID;
    private String typeOfTransport;

    // getters
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

    public String getTypeOfTransport()
    {
        return typeOfTransport;
    }

    // toString
    @Override
    public String toString()
    {
        return "SubjectDepartment{" +
                "subDeptID=" + subDeptID +
                ", subjectID=" + subjectID +
                ", teacherID=" + teacherID +
                ", typeOfTransport='" + typeOfTransport + '\'' +
                '}';
    }

    // private constructors
    private SubjectDepartment (Builder builder)
    {
        this.subDeptID = builder.subDeptID;
        this.subjectID = builder.subjectID;
        this.teacherID = builder.teacherID;
        this.typeOfTransport = builder.typeOfTransport;
    }

    // builder pattern
    public static class Builder
    {
        private int subDeptID;
        private int subjectID;
        private int teacherID;
        private String typeOfTransport;

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

        public Builder setTypeOfTransport(String typeOfTransport)
        {
            this.typeOfTransport = typeOfTransport;
            return this;
        }

        public Builder copy(SubjectDepartment subjectDepartment)
        {
            this.subDeptID = subjectDepartment.getSubDeptID();
            this.subjectID = subjectDepartment.getSubjectID();
            this.teacherID = subjectDepartment.getTeacherID();
            this.typeOfTransport = subjectDepartment.getTypeOfTransport();
            return this;
        }

        public SubjectDepartment build()
        {
            return new SubjectDepartment(this);
        }
    }
}
