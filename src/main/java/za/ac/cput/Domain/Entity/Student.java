/* Student.java
Builder Pattern for Student
Author: Marvin Peter Hope (219445842)
Date: 28 March 2022
*/

package za.ac.cput.Domain.Entity;

public class Student {

    private String studentID;
    private int parentID;
    private int adminID;
    private String stuName;
    private String stuSurname;
    private int grade;
    private String Dob;
    private int idNumber;
    private String address;
    private String importantHealthInfo;
    private double stuAverage;

    //====================================================
    //Private Constructor
    private Student(Builder builder) {
        this.studentID = builder.studentID;
        this.parentID = builder.parentID;
        this.adminID = builder.adminID;
        this.stuName = builder.stuName;
        this.stuSurname = builder.stuSurname;
        this.grade = builder.grade;
        this.Dob = builder.Dob;
        this.idNumber = builder.idNumber;
        this.address = builder.address;
        this.importantHealthInfo = builder.importantHealthInfo;
        this.stuAverage = builder.stuAverage;
    }

    //====================================================
    //Getters and Setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSurname() {
        return stuSurname;
    }

    public void setStuSurname(String stuSurname) {
        this.stuSurname = stuSurname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImportantHealthInfo() {
        return importantHealthInfo;
    }

    public void setImportantHealthInfo(String importantHealthInfo) {
        this.importantHealthInfo = importantHealthInfo;
    }

    public double getStuAverage() {
        return stuAverage;
    }

    public void setStuAverage(double stuAverage) {
        this.stuAverage = stuAverage;
    }

    //====================================================
    // toString
    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", parentID=" + parentID +
                ", adminID=" + adminID +
                ", stuName='" + stuName + '\'' +
                ", stuSurname='" + stuSurname + '\'' +
                ", grade=" + grade +
                ", Dob='" + Dob + '\'' +
                ", idNumber=" + idNumber +
                ", address='" + address + '\'' +
                ", importantHealthInfo='" + importantHealthInfo + '\'' +
                ", stuAverage=" + stuAverage +
                '}';
    }

    //====================================================
    // Builder Pattern
    public static class Builder {
        private String studentID;
        private int parentID;
        private int adminID;
        private String stuName;
        private String stuSurname;
        private int grade;
        private String Dob;
        private int idNumber;
        private String address;
        private String importantHealthInfo;
        private double stuAverage;

        public Student.Builder setStudentID(String studentID) {
            this.studentID = studentID;
            return this;
        }

        public Student.Builder setParentID(int parentID) {
            this.parentID = parentID;
            return this;
        }

        public Student.Builder setAdminID(int adminID) {
            this.adminID = adminID;
            return this;
        }

        public Student.Builder setStuName(String stuName) {
            this.stuName = stuName;
            return this;
        }

        public Student.Builder setStuSurname(String stuSurname) {
            this.stuSurname = stuSurname;
            return this;
        }

        public Student.Builder setGrade(int grade) {
            this.grade = grade;
            return this;
        }

        public Student.Builder setDob(String dob) {
            Dob = dob;
            return this;
        }

        public Student.Builder setIdNumber(int idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public Student.Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student.Builder setImportantHealthInfo(String importantHealthInfo) {
            this.importantHealthInfo = importantHealthInfo;
            return this;
        }

        public Student.Builder setStuAverage(double stuAverage) {
            this.stuAverage = stuAverage;
            return this;
        }

        public Student.Builder copy(Student student) {
            this.studentID = student.getStudentID();
            this.parentID = student.getParentID();
            this.adminID = student.getAdminID();
            this.stuName = student.getStuName();
            this.stuSurname = student.getStuSurname();
            this.grade = student.getGrade();
            this.Dob = student.getDob();
            this.idNumber = student.getIdNumber();
            this.address = student.getAddress();
            this.importantHealthInfo = student.getImportantHealthInfo();
            this.stuAverage = student.getStuAverage();
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }
}
