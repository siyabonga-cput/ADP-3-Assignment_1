///* SubjectDepartmentRepository.java
//   Repository class for SubjectDepartment
//   Author: Raeesah Williams (219091498)
//   Date: 06 April 2022
//*/
//
//package za.ac.cput.Repository.StaffDetailsRepo;
//
//import za.ac.cput.Domain.StaffDetails.SubjectDepartment;
//import za.ac.cput.Repository.Interface.StaffDetailsInterface.ISubjectDepartmentRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class SubjectDepartmentRepository implements ISubjectDepartmentRepository
//{
//    private static SubjectDepartmentRepository repository = null;
//    private Set<SubjectDepartment> subjectDepartmentDB = null;
//
//    private SubjectDepartmentRepository()
//    {
//        subjectDepartmentDB = new HashSet<SubjectDepartment>();
//    }
//
//    public static SubjectDepartmentRepository getRepository()
//    {
//        if (repository == null)
//        {
//            repository = new SubjectDepartmentRepository();
//        }
//        return repository;
//    }
//
//    // create operation
//    @Override
//    public SubjectDepartment create(SubjectDepartment subjectDepartment)
//    {
//        boolean success = subjectDepartmentDB.add(subjectDepartment);
//        if(!success)
//            return null;
//        return subjectDepartment;
//    }
//
//    // read operation
//    @Override
//    public SubjectDepartment read(String subDeptID)
//    {
//        SubjectDepartment subjectDepartment = subjectDepartmentDB.stream()
//                .filter(e-> e.getSubDeptID().equals(subDeptID))
//                .findAny()
//                .orElse(null);
//        return subjectDepartment;
//    }
//
//    // update operation
//    @Override
//    public SubjectDepartment update(SubjectDepartment subjectDepartment)
//    {
//        SubjectDepartment oldSubjectDepartment = read(subjectDepartment.getSubDeptID());
//        if (oldSubjectDepartment != null)
//        {
//            subjectDepartmentDB.remove(oldSubjectDepartment);
//            subjectDepartmentDB.add(subjectDepartment);
//            return null;
//        }
//        return subjectDepartment;
//    }
//
//    // delete operation
//    @Override
//    public boolean delete(String subDeptID)
//    {
//        SubjectDepartment subjectDepartmentToDelete = read(subDeptID);
//        if (subjectDepartmentToDelete == null)
//            return false;
//        subjectDepartmentDB.remove(subjectDepartmentToDelete);
//        return true;
//    }
//
//    // getAll() method
//    @Override
//    public Set<SubjectDepartment> getAll() {
//        return subjectDepartmentDB;
//    }
//}
