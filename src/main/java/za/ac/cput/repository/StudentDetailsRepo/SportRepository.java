//package za.ac.cput.Repository.StudentDetailsRepo;
//
//
//import za.ac.cput.Domain.StudentDetails.Sport;
//import za.ac.cput.Repository.Interface.StudentDetailsInterface.ISportRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
////Siyabonga Tumelo Masango
////219200815
////31/03/2022
////sportFactory.java
//
//public class SportRepository implements ISportRepository {
//
//    private static SportRepository repository = null;
//    private Set<Sport> sportDB = null;
//
//    private SportRepository() {
//        sportDB = new HashSet<Sport>();
//    }
//
//    public static SportRepository getRepository() {
//
//        if (repository == null) {
//            repository = new SportRepository();
//        }
//        return repository;
//    }
//
//    @Override
//    public Sport create(Sport sport) {
//        this.sportDB.add(sport);
//        this.sportDB.add(sport);
//        return sport;
//    }
//
//    @Override
//    public Sport read(String sportID) {
//        for (Sport s : sportDB) {
//            if (s.getSportID().equals(sportID)) {
//                return s;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Sport update(Sport sport) {
//        Sport sport1 = read(sport.getSportID());
//
//        if (sport1 != null){
//            sportDB.remove(sport1);
//            sportDB.add(sport);
//            return sport;
//        }
//
//      return null;
//    }
//
//    @Override
//    public boolean delete(String sportID) {
//        Sport sportDelete = read(sportID);
//        if (sportDelete == null){
//            System.out.println("Sport is null");
//        }
//        sportDB.remove(sportDelete);
//        System.out.println("sport removed");
//        return true;
//    }
//
//    @Override
//    public Set<Sport> getAll() {
//      return sportDB;
//    }
//}
//
