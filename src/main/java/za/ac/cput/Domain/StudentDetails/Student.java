/* Student.java
Builder Pattern for Student
Author: Marvin Peter Hope (219445842)
Date: 28 March 2022
*/

package za.ac.cput.Domain.StudentDetails;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Student implements Serializable {
    @NotNull @Id private String studentID;
    @NotNull
    private String stuName;
    @NotNull
    private String stuSurname;
    @NotNull
    private int grade;
    @NotNull
    private String Dob;
    @NotNull
    private int idNumber;
    @NotNull
    private String address;
    @NotNull
    private String importantHealthInfo;
    @NotNull
    private double stuAverage;

    protected Student() {
    }

    //====================================================
    //Private Constructor
    private Student(Builder builder) {
        this.studentID = builder.studentID;
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

    public String getStuName() {
        return stuName;
    }


    public String getStuSurname() {
        return stuSurname;
    }

    public int getGrade() {
        return grade;
    }


    public String getDob() {
        return Dob;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getImportantHealthInfo() {
        return importantHealthInfo;
    }

    public double getStuAverage() {
        return stuAverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && idNumber == student.idNumber && Double.compare(student.stuAverage, stuAverage) == 0 && studentID.equals(student.studentID) && stuName.equals(student.stuName) && stuSurname.equals(student.stuSurname) && Dob.equals(student.Dob) && address.equals(student.address) && importantHealthInfo.equals(student.importantHealthInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, stuName, stuSurname, grade, Dob, idNumber, address, importantHealthInfo, stuAverage);
    }

    //====================================================
    // toString
    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
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
        private String studentID, stuName, stuSurname;
        private int grade;
        private String Dob;
        private int idNumber;
        private String address,importantHealthInfo;
        private double stuAverage;

        public Student.Builder setStudentID(String studentID) {
            this.studentID = studentID;
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
