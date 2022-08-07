//package za.ac.cput.Domain.StudentDetails;
////Siyabonga Tumelo Masango
////219200815
////31/03/2022
////sport.java
//public class Sport {
//    private String sportID;
//    private String studentID;
//    private String teacherID;
//    private  String  perormanceScore;
//
//
//    //Siyabonga Tumelo Masango
////219200815
////31/03/2022
////sportFactory.java
//
//    private Sport(Sport.Builder builder){
//
//        this.sportID = builder.sportID;
//        this.studentID = builder.studentID;
//        this.teacherID = builder.teacherID;
//        this.perormanceScore = builder.perormanceScore;
//
//
//    }
//
//
//
//    public String getSportID() {
//        return sportID;
//    }
//
//    public void setSportID(String sportID) {
//        this.sportID = sportID;
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
//    public String getTeacherID() {
//        return teacherID;
//    }
//
//    public void setTeacherID(String teacherID) {
//        this.teacherID = teacherID;
//    }
//
//    public String getPerormanceScore() {
//        return perormanceScore;
//    }
//
//    public void setPerormanceScore(String perormanceScore) {
//        this.perormanceScore = perormanceScore;
//    }
//
//    @Override
//    public String toString() {
//        return "Sport{" +
//                "sportID=" + sportID +
//                ", studentID=" + studentID +
//                ", teacherID=" + teacherID +
//                ", perormanceScore=" + perormanceScore +
//                '}';
//    }
//    public static class Builder {
//        private String sportID;
//        private String studentID;
//        private String teacherID;
//        private  String perormanceScore;
//
//
//        public Builder setSportID(String sportID) {
//            this.sportID = sportID;
//            return this;
//        }
//
//        public Builder setStudentID(String studentID) {
//            this.studentID = studentID;
//            return this;
//        }
//
//        public Builder setTeacherID(String teacherID) {
//            this.teacherID = teacherID;
//            return this;
//        }
//
//        public Builder setPerormanceScore(String perormanceScore) {
//            this.perormanceScore = perormanceScore;
//            return this;
//        }
//        public Sport.Builder copy(Sport  sport){
//
//            this.sportID = sport.sportID;
//            this.studentID = sport.studentID;
//            this.teacherID = sport.teacherID;
//            this.perormanceScore = sport.perormanceScore;
//            return this;
//
//        }
//        public Sport build(){
//            return new Sport (this);
//        }
//    }
//}
//
