///* SubjectDepartment.java
//   Entity for the Subject Department
//   Author: Raeesah Williams (219091498)
//   Date: 30 March 2022
//*/
//
//package za.ac.cput.Domain.StaffDetails;
//
//public class SubjectDepartment
//{
//    // constructors
//    private String subDeptID;
//    private String subjectID;
//    private String teacherID;
//    private String typeOfDepartment;
//
//    // getters and setters
//    public String getSubDeptID()
//    {
//        return subDeptID;
//    }
//
//    public String getSubjectID()
//    {
//        return subjectID;
//    }
//
//    public String getTeacherID()
//    {
//        return teacherID;
//    }
//
//    public String getTypeOfDepartment()
//    {
//        return typeOfDepartment;
//    }
//
//    public void setSubDeptID(String subDeptID) {
//        this.subDeptID = subDeptID;
//    }
//
//    public void setSubjectID(String subjectID) {
//        this.subjectID = subjectID;
//    }
//
//    public void setTeacherID(String teacherID) {
//        this.teacherID = teacherID;
//    }
//
//    public void setTypeOfDepartment(String typeOfDepartment) {
//        this.typeOfDepartment = typeOfDepartment;
//    }
//
//    // toString
//    @Override
//    public String toString()
//    {
//        return "SubjectDepartment{" +
//                "subDeptID=" + subDeptID +
//                ", subjectID=" + subjectID +
//                ", teacherID=" + teacherID +
//                ", typeOfTransport='" + typeOfDepartment + '\'' +
//                '}';
//    }
//
//    // private constructors
//    private SubjectDepartment (Builder builder)
//    {
//        this.subDeptID = builder.subDeptID;
//        this.subjectID = builder.subjectID;
//        this.teacherID = builder.teacherID;
//        this.typeOfDepartment = builder.typeOfDepartment;
//    }
//
//    // builder pattern
//    public static class Builder
//    {
//        private String subDeptID;
//        private String subjectID;
//        private String teacherID;
//        private String typeOfDepartment;
//
//        public Builder setSubDeptID(String subDeptID)
//        {
//            this.subDeptID = subDeptID;
//            return this;
//        }
//
//        public Builder setSubjectID(String subjectID)
//        {
//            this.subjectID = subjectID;
//            return this;
//        }
//
//        public Builder setTeacherID(String teacherID)
//        {
//            this.teacherID = teacherID;
//            return this;
//        }
//
//        public Builder setTypeOfDepartment(String typeOfDepartment)
//        {
//            this.typeOfDepartment = typeOfDepartment;
//            return this;
//        }
//
//        public Builder copy(SubjectDepartment subjectDepartment)
//        {
//            this.subDeptID = subjectDepartment.getSubDeptID();
//            this.subjectID = subjectDepartment.getSubjectID();
//            this.teacherID = subjectDepartment.getTeacherID();
//            this.typeOfDepartment = subjectDepartment.getTypeOfDepartment();
//            return this;
//        }
//
//        public SubjectDepartment build()
//        {
//            return new SubjectDepartment(this);
//        }
//    }
//}
