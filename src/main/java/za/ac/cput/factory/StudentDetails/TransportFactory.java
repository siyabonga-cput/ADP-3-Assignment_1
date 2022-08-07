///* TransportFactory.java
//   Factory class for Transport
//   Author: Raeesah Williams (219091498)
//   Date: 1 April 2022
//*/
//package za.ac.cput.Factory.StudentDetails;
//
//import za.ac.cput.Domain.StudentDetails.Transport;
//import za.ac.cput.util.Helper;
//public class TransportFactory
//{
//    public static Transport createTransport(String studentID,
//                                            String suppStaffID,
//                                            String typeOfTransport)
//    {
//        String transportID = Helper.generateTransportID();
//        Transport transport = new Transport.Builder().
//                setTransportID(transportID).
//                setStudentID(studentID).
//                setSuppStaffID(suppStaffID).
//                setTypeOfTransport(typeOfTransport).build();
//        return transport;
//    }
//}
