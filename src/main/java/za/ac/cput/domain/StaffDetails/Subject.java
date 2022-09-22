///* Subject.java
//Builder Pattern for Subject
//Author: Jayden Johnson (219086796)
//Date: 7 August 2022
//*/
//
//package za.ac.cput.domain.StaffDetails;
//
//import org.hibernate.annotations.NotFound;
//import org.hibernate.annotations.NotFoundAction;
//import za.ac.cput.domain.StudentDetails.Student;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.validation.constraints.NotNull;
//import java.io.Serializable;
//import java.util.Objects;
//
//import static javax.persistence.CascadeType.MERGE;
//import static javax.persistence.CascadeType.PERSIST;
//
//@Entity
//public class Subject implements Serializable {
//    @NotNull
//    @Id
//    private String subjectID;
//    @ManyToOne(cascade = {PERSIST, MERGE})
//    @NotFound(action = NotFoundAction.IGNORE)
//    private SubjectDepartment subDep;
//
//    @ManyToOne(cascade = {PERSIST, MERGE})
//    @NotFound(action = NotFoundAction.IGNORE)
//    private Student studentID;
//    @NotNull
//    private String modules;
//    @NotNull
//    private double subAverage;
//    @NotNull
//    private double stuAverage;
//
//    protected Subject(){
//    }
//
//    private Subject(Builder builder){
//        this.subjectID = builder.subjectID;
//        this.subDep = builder.subDep;
//        this.studentID = builder.studentID;
//        this.modules = builder.modules;
//        this.subAverage = builder.subAverage;
//        this.stuAverage = builder.stuAverage;
//    }
//
//    public String getSubjectID() {
//        return subjectID;
//    }
//
//    public SubjectDepartment getSubDep() {
//        return subDep;
//    }
//
//    public Student getStudentID() {
//        return studentID;
//    }
//
//    public String getModules() {
//        return modules;
//    }
//
//    public double getSubAverage() {
//        return subAverage;
//    }
//
//    public double getStuAverage() {
//        return stuAverage;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Subject subject = (Subject) o;
//        return Double.compare(subject.subAverage, subAverage) == 0 && Double.compare(subject.stuAverage, stuAverage) == 0 && subjectID.equals(subject.subjectID) && subDep.equals(subject.subDep) && studentID.equals(subject.studentID) && modules.equals(subject.modules);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(subjectID, subDep, studentID, modules, subAverage, stuAverage);
//    }
//
//    @Override
//    public String toString() {
//        return "Subject{" +
//                "subjectID='" + subjectID + '\'' +
//                ", subDep=" + subDep +
//                ", studentId=" + studentID +
//                ", modules='" + modules + '\'' +
//                ", subAverage=" + subAverage +
//                ", stuAverage=" + stuAverage +
//                '}';
//    }
//
//    public static class Builder{
//        private String subjectID;
//        private SubjectDepartment subDep;
//        private Student studentID;
//        private String modules;
//        private double subAverage;
//        private double stuAverage;
//
//        public Subject.Builder setSubjectID(String subjectID) {
//            this.subjectID = subjectID;
//            return this;
//        }
//
//        public Subject.Builder setSubjectDepartment(SubjectDepartment subDep) {
//            this.subDep = subDep;
//            return this;
//        }
//
//        public Subject.Builder setStudentId(Student studentID) {
//            this.studentID = studentID;
//            return this;
//        }
//
//        public Subject.Builder setModules(String modules) {
//            this.modules = modules;
//            return this;
//        }
//
//        public Subject.Builder setSubAverage(double subAverage) {
//            this.subAverage = subAverage;
//            return this;
//        }
//
//        public Subject.Builder setStuAverage(double stuAverage) {
//            this.stuAverage = stuAverage;
//            return this;
//        }
//
//        public Builder copy(Subject subject){
//            this.subjectID = subject.getSubjectID();
//            this.subDep = subject.getSubDep();
//            this.studentID = subject.getStudentID();
//            this.modules = subject.getModules();
//            this.subAverage = subject.getSubAverage();
//            this.stuAverage = subject.getStuAverage();
//            return this;
//        }
//        public Subject build(){
//            return new Subject( this);
//        }
//    }
//}
//
