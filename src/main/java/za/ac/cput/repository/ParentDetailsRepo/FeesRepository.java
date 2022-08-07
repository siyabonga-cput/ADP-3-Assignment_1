///*
//FeesRepository.java
//Repository for FeesRepository
//Author: Tiffany Kiwiets (219322732)
// */
//
//package za.ac.cput.Repository.ParentDetailsRepo;
//
//import za.ac.cput.Domain.ParentDetails.Fees;
//import za.ac.cput.Repository.Interface.ParentDetailsInterface.IFeesRepository;
//
//import java.util.HashSet;
//import  java.util.Set;
//
//public class FeesRepository implements IFeesRepository {
//    public static FeesRepository repository = null;
//    private Set<Fees> feesDB = null;
//
//    private FeesRepository() {
//        feesDB = new HashSet<Fees>();
//    }
//
//    public static FeesRepository getRepository() {
//        if (repository == null) {
//            repository = new FeesRepository();
//        }
//        return repository;
//    }
//
//    //create
//    @Override
//    public Fees create(Fees fees) {
//        boolean success = feesDB.add(fees);
//        if (!success)
//            return null;
//        return fees;
//    }
//
//    //read
//    @Override
//    public Fees read(String feesID) {
//        Fees fees = feesDB.stream()
//                .filter(e-> e.getFeeID().equals(feesID) )
//                .findAny()
//                .orElse(null);
//        return fees;
//    }
//
//    //update
//    @Override
//    public Fees update(Fees fees) {
//        Fees oldFees = read(fees.getFeeID() );
//        if (oldFees != null) {
//            feesDB.remove(oldFees);
//            feesDB.add(fees);
//            return null;
//        }
//        return fees;
//    }
//
//    //delete
//    @Override
//    public boolean delete(String feesID) {
//        Fees feesToDelete = read(feesID);
//        if (feesID == null)
//            return false;
//        feesDB.remove(feesToDelete);
//        return true;
//    }
//
//    //getAll
//    @Override
//    public Set<Fees> getAll() {
//        return feesDB;
//    }
//}
