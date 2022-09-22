///* StudentPrestige.java
//    Entity for Student Prestige
//    Author: Kegomoditswe Leshope - 219189048
//    Date: 7 August 2022
//*/
//
//package za.ac.cput.domain.StudentDetails;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.validation.constraints.NotNull;
//
//
//@Entity
//public class StudentPrestige {
//
//    @Id
//    @Column(name = "prestige_id")
//    private String prestigeId;
//    @NotNull private int studentId;
//    @NotNull private int academicId;
//    @NotNull private int sportId;
//    @NotNull private int cultureId;
//    @NotNull private String prestigeType;
//
//    protected StudentPrestige(){}
//
//    //private StudentPrestige(){}
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
//    //getters
//    public String getPrestigeId() {
//        return prestigeId;
//    }
//
//    public int getStudentId() {
//        return studentId;
//    }
//
//    public int getAcademicId() {
//        return academicId;
//    }
//
//    public int getSportId() {
//        return sportId;
//    }
//
//    public int getCultureId() {
//        return cultureId;
//    }
//
//    public String getPrestigeType() {
//        return prestigeType;
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
//       public Builder setStudentId(int studentId) {
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
