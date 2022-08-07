///* TeacherRepository.java
//Repository package for TeacherRepository
//Author: Jayden Johnson (219086796)
//Date: 4 April 2022
//*/
//
//package za.ac.cput.Repository.StaffDetailsRepo;
//
//import za.ac.cput.Domain.StaffDetails.Teacher;
//import za.ac.cput.Repository.Interface.StaffDetailsInterface.ITeacherRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class TeacherRepository implements ITeacherRepository {
//    private static TeacherRepository repository = null;
//    private Set<Teacher> teacherDB = null;
//
//    private TeacherRepository(){
//        teacherDB = new HashSet<Teacher>();
//    }
//
//    static TeacherRepository getRepository(){
//        if(repository == null){
//            repository = new TeacherRepository();
//        }
//        return repository;
//    }
//
//    @Override
//    public Teacher create(Teacher teacher) {
//        boolean success = teacherDB.add(teacher);
//        if(!success)
//            return null;
//        return teacher;
//    }
//
//    @Override
//    public Teacher read(String teacherID) {
//        Teacher teacher = teacherDB.stream()
//                .filter(e -> e.getTeacherID().equals(teacherID))
//                .findAny()
//                .orElse(null);
//        return teacher;
//    }
//
//    @Override
//    public Teacher update(Teacher teacher) {
//        Teacher oldTeacher = read(teacher.getTeacherID());
//        if(oldTeacher != null){
//            teacherDB.remove(oldTeacher);
//            teacherDB.add(teacher);
//            return teacher;
//        }
//        return null;
//    }
//
//    @Override
//    public boolean delete(String teacherID) {
//        Teacher teacherToDelete = read(teacherID);
//        if (teacherToDelete == null)
//            return false;
//        teacherDB.remove(teacherToDelete);
//        return true;
//    }
//
//    @Override
//    public Set<Teacher> getAll() {
//        return teacherDB;
//    }
//}
