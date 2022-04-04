/* Teacher.java
Builder Pattern for Teacher
Author: Jayden Johnson (219086796)
Date: 29 March 2022
*/

package za.ac.cput.Domain.Entity;

public class Teacher {
    private String teacherID;
    private String adminID;
    private String subDeptID;
    private String teachName;
    private String teachSurname;
    private String cellNum;
    private String qualification;
    private String importantInfo;
    private String post;

    private Teacher(Builder builder){
        this.teacherID = builder.teacherID;
        this.adminID = builder.adminID;
        this.subDeptID = builder.subDeptID;
        this.teachName = builder.teachName;
        this.teachSurname = builder.teachSurname;
        this.cellNum = builder.cellNum;
        this.qualification = builder.qualification;
        this.importantInfo = builder.importantInfo;
        this.post = builder.post;
    }

    public String getTeacherID() {
        return teacherID;
    }


    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }


    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getSubDeptID() {
        return subDeptID;
    }

    public void setSubDeptID(String subDeptID) {
        this.subDeptID = subDeptID;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public String getTeachSurname() {
        return teachSurname;
    }

    public void setTeachSurname(String teachSurname) {
        this.teachSurname = teachSurname;
    }

    public String getCellNum() {
        return cellNum;
    }

    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getImportantInfo() {
        return importantInfo;
    }

    public void setImportantInfo(String importantInfo) {
        this.importantInfo = importantInfo;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", adminID=" + adminID +
                ", subDeptID=" + subDeptID +
                ", teachName='" + teachName + '\'' +
                ", teachSurname='" + teachSurname + '\'' +
                ", cellNum='" + cellNum + '\'' +
                ", qualification='" + qualification + '\'' +
                ", importantInfo='" + importantInfo + '\'' +
                ", post='" + post + '\'' +
                '}';
    }

    public static class Builder{
        private String teacherID;
        private String adminID;
        private String subDeptID;
        private String teachName;
        private String teachSurname;
        private String cellNum;
        private String qualification;
        private String importantInfo;
        private String post;

        public Builder setTeacherID(String teacherID) {
            this.teacherID = teacherID;
            return this;
        }

        public Builder setAdminID(String adminID) {
            this.adminID = adminID;
            return this;
        }

        public Builder setSubDeptID(String subDeptID) {
            this.subDeptID = subDeptID;
            return this;
        }

        public Builder setTeachName(String teachName) {
            this.teachName = teachName;
            return this;
        }

        public Builder setTeachSurname(String teachSurname) {
            this.teachSurname = teachSurname;
            return this;
        }

        public Builder setCellNum(String cellNum) {
            this.cellNum = cellNum;
            return this;
        }

        public Builder setQualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        public Builder setImportantInfo(String importantInfo) {
            this.importantInfo = importantInfo;
            return this;
        }

        public Builder setPost(String post) {
            this.post = post;
            return this;
        }

        public Builder copy(Teacher teacher){
            this.teacherID = teacher.getTeacherID();
            this.adminID = teacher.getAdminID();
            this.subDeptID = teacher.getSubDeptID();
            this.teachName = teacher.getTeachName();
            this.teachSurname = teacher.getTeachSurname();
            this.cellNum = teacher.getCellNum();
            this.qualification = teacher.getQualification();
            this.importantInfo = teacher.getImportantInfo();
            this.post = teacher.getPost();
            return this;
        }
        public Teacher build(){
            return new Teacher( this);
        }
    }
}


