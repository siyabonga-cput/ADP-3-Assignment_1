///* TransportRepository.java
//   Repository class for the Transport
//   Author: Raeesah Williams (219091498)
//   Date: 5 April 2022
//*/
//
//package za.ac.cput.Repository.StudentDetailsRepo;
//
//import za.ac.cput.Domain.StudentDetails.Transport;
//import za.ac.cput.Repository.Interface.StaffDetailsInterface.ITransportRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class TransportRepository implements ITransportRepository
//{
//    private static TransportRepository repository = null;
//    private Set<Transport>transportDB = null;
//
//    private TransportRepository(){
//        transportDB = new HashSet<Transport>();
//    }
//
//
//    public static TransportRepository getRepository()
//    {
//        if (repository == null)
//        {
//            repository = new TransportRepository();
//        }
//        return repository;
//    }
//
//    @Override
//    // create operation
//    public Transport create (Transport transport)
//    {
//        boolean success = transportDB.add(transport);
//        if (!success)
//            return transport;
//        return transport;
//    }
//
//    @Override
//    // read operation
//    public Transport read (String transportID)
//    {
//        Transport transport = transportDB.stream()
//                .filter(e-> e.getTransportID().equals(transportID))
//                .findAny()
//                .orElse(null);
//        return transport;
//    }
//
//    @Override
//    // update operation
//    public Transport update(Transport transport)
//    {
//        Transport oldTransport = read(transport.getTransportID());
//        if(oldTransport != null)
//        {
//            transportDB.remove(oldTransport);
//            transportDB.add(transport);
//            return null;
//        }
//        return transport;
//    }
//
//    @Override
//    // delete operation
//    public boolean delete(String transportID)
//    {
//        Transport transportToDelete = read(transportID);
//        if(transportID == null)
//            return false;
//        transportDB.remove(transportToDelete);
//        return true;
//    }
//
//    @Override
//    // getAll() method
//    public Set<Transport>getAll()
//    {
//        return transportDB;
//    }
//}
