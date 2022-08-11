///* Transport.java
//   Entity for the Transport
//   Author: Raeesah Williams (219091498)
//   Date: 30 March 2022
//*/
//
//package za.ac.cput.domain.StudentDetails;
//
//public class Transport
//{
//    // constructors
//    public String transportID;
//    public String studentID;
//    public String suppStaffID;
//    private String typeOfTransport;
//
//    //getters and setters
//
//    public String getTransportID()
//    {
//        return transportID;
//    }
//
//    public String getStudentID()
//    {
//        return studentID;
//    }
//
//    public String getSuppStaffID()
//    {
//        return suppStaffID;
//    }
//
//    public String getTypeOfTransport()
//    {
//        return typeOfTransport;
//    }
//
//    // toString
//    @Override
//    public String toString() {
//        return "Transport{" +
//                "transportID=" + transportID +
//                ", studentID=" + studentID +
//                ", suppStaffID=" + suppStaffID +
//                ", typeOfTransport='" + typeOfTransport + '\'' +
//                '}';
//    }
//
//    // private constructors
//    private Transport (Builder builder)
//    {
//        this.transportID = builder.transportID;
//        this.studentID = builder.studentID;
//        this.suppStaffID = builder.suppStaffID;
//        this.typeOfTransport = builder.typeOfTransport;
//    }
//
//    // builder pattern
//    public static class Builder
//    {
//        private String transportID;
//        private String studentID;
//        private String suppStaffID;
//        private String typeOfTransport;
//
//        public Builder setTransportID(String transportID) {
//            this.transportID = transportID;
//            return this;
//        }
//
//        public Transport.Builder setStudentID(String studentID) {
//            this.studentID = studentID;
//            return this;
//        }
//
//        public Transport.Builder setSuppStaffID(String suppStaffID) {
//            this.suppStaffID = suppStaffID;
//            return this;
//        }
//
//        public Transport.Builder setTypeOfTransport(String typeOfTransport) {
//            this.typeOfTransport = typeOfTransport;
//            return this;
//        }
//
//        //builder copy
//        public Builder copy(Transport transport)
//        {
//            this.transportID = transport.getTransportID();
//            this.studentID = transport.getStudentID();
//            this.suppStaffID = transport.getSuppStaffID();
//            this.typeOfTransport = transport.getTypeOfTransport();
//            return this;
//        }
//
//        public Transport build()
//        {
//            return new Transport(this);
//        }
//    }
//}
