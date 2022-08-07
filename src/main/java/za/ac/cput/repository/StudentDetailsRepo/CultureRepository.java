//package za.ac.cput.Repository.StudentDetailsRepo;
//
//import za.ac.cput.Domain.StudentDetails.Culture;
//import za.ac.cput.Repository.Interface.StudentDetailsInterface.ICultureRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class CultureRepository implements ICultureRepository {
//
//    private static CultureRepository repository = null;
//    private Set<Culture> cultureDB = null;
//
//    private CultureRepository(){
//        cultureDB = new HashSet<Culture>();
//    }
//
//    public static CultureRepository getRepository(){
//        if(repository == null){
//            repository = new CultureRepository();
//        }
//        return repository;
//    }
//
//    @Override
//    public Culture create(Culture culture) {
//        boolean success = cultureDB.add(culture);
//        if (!success)
//            return null;
//        return culture;
//    }
//
//    @Override
//    public Culture read(String cultureId) {
//        Culture culture = cultureDB.stream()
//                .filter(culture1 -> culture1.getCultureId().equals(cultureId))
//                .findAny()
//                .orElse(null);
//        return culture;
//    }
//
//    @Override
//    public Culture update(Culture culture) {
//        Culture oldCulture = read(culture.getCultureId());
//        if(oldCulture != null){
//            cultureDB.remove(oldCulture);
//            cultureDB.add(culture);
//            return culture;
//        }
//        return null;
//    }
//
//    @Override
//    public boolean delete(String cultureId) {
//        Culture cultureToDelete = read(cultureId);
//        if(cultureToDelete == null)
//            return false;
//        cultureDB.remove(cultureToDelete);
//        return true;
//    }
//
//    @Override
//    public Set<Culture> getAll() {
//        return cultureDB;
//    }
//}
//
