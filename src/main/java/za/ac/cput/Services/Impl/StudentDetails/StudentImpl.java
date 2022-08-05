//package za.ac.cput.Services.Impl.StudentDetails;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.Domain.StudentDetails.Student;
//import za.ac.cput.Repository.StudentDetailsRepo.IStudentRepository;
//import za.ac.cput.Services.Interface.StudentDetails.IStudent;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentImpl implements IStudent {
//    private final IStudentRepository repository;
//
//    @Autowired
//    public StudentImpl(IStudentRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public Student save(Student student) {
//
//        return this.repository.save(student);
//    }
//
//    @Override
//    public Optional<Student> read(String s) {
//        return this.repository.findById(s);
//    }
//
//    @Override
//    public void delete(Student student) {
//        this.repository.delete(student);
//    }
//
//    @Override
//    public List<Student> findall() {
//        return this.repository.findAll();
//    }
//}
//
