///* StudentPrestige.java
//    Entity for Student Prestige
//    Author: Kegomoditswe Leshope - 219189048
//    Date: 28 March 2022
//*/
//package za.ac.cput.Domain.StudentDetails;
//
//public class StudentPrestige {
//
//    private String prestigeId;
//    private int studentId;
//    private int academicId;
//    private int sportId;
//    private int cultureId;
//    private String prestigeType;
//
//    private StudentPrestige(){}
//
//    //private constructor
//    private StudentPrestige (Builder builder){
//        this.prestigeId = builder.prestigeId;
//        this.studentId = builder.studentId;
//        this.academicId = builder.academicId;
//        this.sportId = builder.sportId;
//        this.cultureId = builder.cultureId;
//        this.prestigeType = builder.prestigeType;
//    }
//
//    //getters and setters
//    public String getPrestigeId() {
//        return prestigeId;
//    }
//
//    public void setPrestigeId(String prestigeId) {
//        this.prestigeId = prestigeId;
//    }
//
//    public int getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(int studentId) {
//        this.studentId = studentId;
//    }
//
//    public int getAcademicId() {
//        return academicId;
//    }
//
//    public void setAcademicId(int academicId) {
//        this.academicId = academicId;
//    }
//
//    public int getSportId() {
//        return sportId;
//    }
//
//    public void setSportId(int sportId) {
//        this.sportId = sportId;
//    }
//
//    public int getCultureId() {
//        return cultureId;
//    }
//
//    public void setCultureId(int cultureId) {
//        this.cultureId = cultureId;
//    }
//
//    public String getPrestigeType() {
//        return prestigeType;
//    }
//
//    public void setPrestigeType(String prestigeType) {
//        this.prestigeType = prestigeType;
//    }
//
//    //toString
//    @Override
//    public String toString() {
//        return "StudentPrestige{" +
//                "prestigeId=" + prestigeId +
//                ", studentId=" + studentId +
//                ", academicId=" + academicId +
//                ", sportId=" + sportId +
//                ", cultureId=" + cultureId +
//                ", prestigeType='" + prestigeType + '\'' +
//                '}';
//    }
//
//    //builder pattern
//    public static class Builder{
//        private String prestigeId;
//        private int studentId;
//        private int academicId;
//        private int sportId;
//        private int cultureId;
//        private String prestigeType;
//
//        //setters
//        public Builder setPrestigeId(String prestigeId) {
//            this.prestigeId = prestigeId;
//            return this;
//        }
//
//        public Builder setStudentId(int studentId) {
//            this.studentId = studentId;
//            return this;
//        }
//
//        public Builder setAcademicId(int academicId) {
//            this.academicId = academicId;
//            return this;
//        }
//
//        public Builder setSportId(int sportId) {
//            this.sportId = sportId;
//            return this;
//        }
//
//        public Builder setCultureId(int cultureId) {
//            this.cultureId = cultureId;
//            return this;
//        }
//
//        public Builder setPrestigeType(String prestigeType) {
//            this.prestigeType = prestigeType;
//            return this;
//        }
//
//        public Builder copy (StudentPrestige studentPrestige){
//            this.prestigeId = studentPrestige.prestigeId;
//            this.studentId = studentPrestige.studentId;
//            this.academicId = studentPrestige.academicId;
//            this.sportId = studentPrestige.sportId;
//            this.cultureId = studentPrestige.cultureId;
//            this.prestigeType = studentPrestige.prestigeType;
//            return this;
//        }
//
//        public StudentPrestige build(){
//            return new StudentPrestige(this);
//        }
//    }
//
//}
