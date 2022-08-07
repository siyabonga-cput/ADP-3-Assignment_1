///* Culture.java
//    Entity for Culture
//    Author: Kegomoditswe Leshope - 219189048
//    Date: 28 March 2022
//*/
//
//package za.ac.cput.Domain.StudentDetails;
//
//public class Culture {
//    private String cultureId;
//    private int studentId;
//    private String cultureType;
//
//    //private constructor
//    private Culture(Builder builder){
//        this.cultureId = builder.cultureId;
//        this.studentId = builder.studentId;
//        this.cultureType = builder.cultureType;
//    }
//
//    //getters and setters
//    public String getCultureId() {
//        return cultureId;
//    }
//
//    public void setCultureId(String cultureId) {
//        this.cultureId = cultureId;
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
//    public String getCultureType() {
//        return cultureType;
//    }
//
//    public void setCultureType(String cultureType) {
//        this.cultureType = cultureType;
//    }
//
//    //toString
//    @Override
//    public String toString() {
//        return "Culture{" +
//                "cultureId=" + cultureId +
//                ", studentId=" + studentId +
//                ", cultureType='" + cultureType + '\'' +
//                '}';
//    }
//
//    //builder pattern
//    public static class Builder {
//        private String cultureId;
//        private int studentId;
//        private String cultureType;
//
//        //setters
//        public Builder setCultureId(String cultureId) {
//            this.cultureId = cultureId;
//            return this;
//        }
//
//        public Builder setStudentId(int studentId) {
//            this.studentId = studentId;
//            return this;
//        }
//
//        public Builder setCultureType(String cultureType) {
//            this.cultureType = cultureType;
//            return this;
//        }
//
//
//        public Builder copy (Culture culture){
//            this.cultureId = culture.cultureId;
//            this.studentId = culture.studentId;
//            this.cultureType = culture.cultureType;
//            return this;
//        }
//
//        public Culture build(){
//            return new Culture(this);
//        }
//    }
//}
