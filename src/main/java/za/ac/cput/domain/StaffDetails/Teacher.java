/* Teacher.java
Builder Pattern for Teacher
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.domain.StaffDetails;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import za.ac.cput.domain.StudentDetails.Student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Objects;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

@Entity
public class Teacher {
    @NotNull @Id
    private String teacherID;
    @NotNull
    private String teachName;
    @NotNull
    private String teachSurname;
    @NotNull
    private String cellNum;
    @NotNull
    private String qualification;

    private String importantInfo;
    @NotNull
    private String post;

    @ManyToOne(cascade = {PERSIST, MERGE})
    @NotFound(action = NotFoundAction.IGNORE)
    private Student student;

    // You require the Admin ID
    //private Admin admin;

    protected Teacher(){
    }

    private Teacher(Builder builder){
        this.teacherID = builder.teacherID;
        this.teachName = builder.teachName;
        this.teachSurname = builder.teachSurname;
        this.cellNum = builder.cellNum;
        this.qualification = builder.qualification;
        this.importantInfo = builder.importantInfo;
        this.post = builder.post;
        this.student = builder.student;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getTeachName() {
        return teachName;
    }

    public String getTeachSurname() {
        return teachSurname;
    }

    public String getCellNum() {
        return cellNum;
    }

    public String getQualification() {
        return qualification;
    }

    public String getImportantInfo() {
        return importantInfo;
    }

    public String getPost() {
        return post;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teacherID.equals(teacher.teacherID) && teachName.equals(teacher.teachName) && teachSurname.equals(teacher.teachSurname) && cellNum.equals(teacher.cellNum) && qualification.equals(teacher.qualification) && importantInfo.equals(teacher.importantInfo) && post.equals(teacher.post) && student.equals(teacher.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherID, teachName, teachSurname, cellNum, qualification, importantInfo, post, student);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", teachName='" + teachName + '\'' +
                ", teachSurname='" + teachSurname + '\'' +
                ", cellNum='" + cellNum + '\'' +
                ", qualification='" + qualification + '\'' +
                ", importantInfo='" + importantInfo + '\'' +
                ", post='" + post + '\'' +
                ", student=" + student +
                '}';
    }

    public static class Builder{
        private String teacherID;
        private String teachName;
        private String teachSurname;
        private String cellNum;
        private String qualification;
        private String importantInfo;
        private String post;
        private Student student;

        public Teacher.Builder setTeacherID(String teacherID) {
            this.teacherID = teacherID;
            return this;
        }


        public Teacher.Builder setTeachName(String teachName) {
            this.teachName = teachName;
            return this;
        }

        public Teacher.Builder setTeachSurname(String teachSurname) {
            this.teachSurname = teachSurname;
            return this;
        }

        public Teacher.Builder setCellNum(String cellNum) {
            this.cellNum = cellNum;
            return this;
        }

        public Teacher.Builder setQualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        public Teacher.Builder setImportantInfo(String importantInfo) {
            this.importantInfo = importantInfo;
            return this;
        }

        public Teacher.Builder setPost(String post) {
            this.post = post;
            return this;
        }

        public Teacher.Builder setStudent(Student student) {
            this.student = student;
            return this;
        }

        public Builder copy(Teacher teacher){
            this.teacherID = teacher.getTeacherID();
            this.teachName = teacher.getTeachName();
            this.teachSurname = teacher.getTeachSurname();
            this.cellNum = teacher.getCellNum();
            this.qualification = teacher.getQualification();
            this.importantInfo = teacher.getImportantInfo();
            this.post = teacher.getPost();
            this.student = teacher.getStudent();
            return this;
        }
        public Teacher build(){
            return new Teacher( this);
        }
    }
}


