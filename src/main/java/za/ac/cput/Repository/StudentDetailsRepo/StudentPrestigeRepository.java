//package za.ac.cput.Repository.StudentDetailsRepo;
//
//import za.ac.cput.Domain.StudentDetails.StudentPrestige;
//import za.ac.cput.Repository.Interface.StudentDetailsInterface.IStudentPrestigeRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class StudentPrestigeRepository implements IStudentPrestigeRepository {
//
//    private static StudentPrestigeRepository repository = null;
//    private Set<StudentPrestige> studentPrestigeDB = null;
//
//    private StudentPrestigeRepository(){
//        studentPrestigeDB = new HashSet<StudentPrestige>();
//    }
//     public static StudentPrestigeRepository getRepository(){
//        if (repository == null){
//            repository = new StudentPrestigeRepository();
//        }
//        return repository;
//     }
//
//    @Override
//    public StudentPrestige create(StudentPrestige studentPrestige) {
//        boolean success = studentPrestigeDB.add(studentPrestige);
//        if(!success)
//            return null;
//        return studentPrestige;
//    }
//
//    public StudentPrestige read(String prestigeId) {
//        for (StudentPrestige s: studentPrestigeDB){
//            if (s.getPrestigeId().equals(prestigeId) )
//                return s;
//        }
//        return null;
//    }
//
//    @Override
//    public StudentPrestige update(StudentPrestige studentPrestige) {
//        StudentPrestige oldStudentPrestige = read(studentPrestige.getPrestigeId());
//        if(oldStudentPrestige != null){
//            studentPrestigeDB.remove(oldStudentPrestige);
//            studentPrestigeDB.add(studentPrestige);
//            return studentPrestige;
//        }
//        return null;
//    }
//
//    @Override
//    public boolean delete(String prestigeId) {
//        StudentPrestige prestigeToDelete = read(prestigeId);
//        if (prestigeToDelete == null)
//            return false;
//        studentPrestigeDB.remove(prestigeToDelete);
//        return true;
//    }
//
//
//    @Override
//    public Set<StudentPrestige> getAll() {
//        return studentPrestigeDB;
//    }
//}
