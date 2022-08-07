///* Subject.java
//Builder Pattern for Subject
//Author: Jayden Johnson (219086796)
//Date: 29 March 2022
//*/
//
//package za.ac.cput.Domain.StaffDetails;
//
//public class Subject {
//    private String subjectID;
//    private String studentID;
//    private String subDeptID;
//    private String modules;
//    private double subAverage;
//    private double stuAverage;
//
//    private Subject(Builder builder){
//        this.subjectID = builder.subjectID;
//        this.studentID = builder.studentID;
//        this.subDeptID = builder.subDeptID;
//        this.modules = builder.modules;
//        this.subAverage = builder.subAverage;
//        this.stuAverage = builder.stuAverage;
//    }
//
//    public String getSubjectID() {
//        return subjectID;
//    }
//
//    public void setSubjectID(String subjectID) {
//        this.subjectID = subjectID;
//    }
//
//    public String getStudentID() {
//        return studentID;
//    }
//
//    public void setStudentID(String studentID) {
//        this.studentID = studentID;
//    }
//
//    public String getSubDeptID() {
//        return subDeptID;
//    }
//
//    public void setSubDeptID(String subDeptID) {
//        this.subDeptID = subDeptID;
//    }
//
//    public String getModules() {
//        return modules;
//    }
//
//    public void setModules(String modules) {
//        this.modules = modules;
//    }
//
//    public double getSubAverage() {
//        return subAverage;
//    }
//
//    public void setSubAverage(double subAverage) {
//        this.subAverage = subAverage;
//    }
//
//    public double getStuAverage() {
//        return stuAverage;
//    }
//
//    public void setStuAverage(double stuAverage) {
//        this.stuAverage = stuAverage;
//    }
//
//    @Override
//    public String toString() {
//        return "Subject{" +
//                "subjectID=" + subjectID +
//                ", studentID=" + studentID +
//                ", subDeptID=" + subDeptID +
//                ", modules='" + modules + '\'' +
//                ", subAverage=" + subAverage +
//                ", stuAverage=" + stuAverage +
//                '}';
//    }
//
//    public static class Builder{
//        private String subjectID;
//        private String studentID;
//        private String subDeptID;
//        private String modules;
//        private double subAverage;
//        private double stuAverage;
//
//        public Builder setSubjectID(String subjectID) {
//            this.subjectID = subjectID;
//            return this;
//        }
//
//        public Builder setStudentID(String studentID) {
//            this.studentID = studentID;
//            return this;
//        }
//
//        public Builder setSubDeptID(String subDeptID) {
//            this.subDeptID = subDeptID;
//            return this;
//        }
//
//        public Builder setModules(String modules) {
//            this.modules = modules;
//            return this;
//        }
//
//        public Builder setSubAverage(double subAverage) {
//            this.subAverage = subAverage;
//            return this;
//        }
//
//        public Builder setStuAverage(double stuAverage) {
//            this.stuAverage = stuAverage;
//            return this;
//        }
//
//        public Builder copy(Subject subject){
//            this.subjectID = subject.getSubjectID();
//            this.studentID = subject.getStudentID();
//            this.subDeptID = subject.getSubDeptID();
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
