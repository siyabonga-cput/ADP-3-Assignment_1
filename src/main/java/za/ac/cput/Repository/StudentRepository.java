/* StudentRepository.java
Repository for StudentRepository
Author: Marvin Peter Hope (219445842)
Date: 2 April 2022
*/

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentRepository implements IStudentRepository {
    private static StudentRepository repository = null;
    private Set<Student> studentDB = null;

    private StudentRepository() {
        studentDB = new HashSet<Student>();
    }
    public static StudentRepository getRepository() {
        if (repository == null) {
            repository = new StudentRepository();
        }
        return repository;
    }
    //===========================================
    //Create
    @Override
    public Student create(Student student) {
        boolean success = studentDB.add(student);
        if (!success)
            return null;
        return student;
    }
    //===========================================
    //Read
    @Override
    public Student read(String studentID) {
        Student student = studentDB.stream()
                .filter(e-> e.getStudentID().equals(studentID) )
                .findAny()
                .orElse(null);
        return student;
    }
    //===========================================
    //Update
    @Override
    public Student update(Student student) {
        Student oldStudent = read(student.getStudentID());
        if(oldStudent != null){
            studentDB.remove(oldStudent);
            studentDB.add(student);
            return student;
        }
        return null;
    }
    //===========================================
    //Delete
    @Override
    public boolean delete(String studentID) {
        Student studentToDelete = read(studentID);
        if(studentID == null)
            return false;
        studentDB.remove(studentToDelete);
        return true;
    }
    //===========================================
    //GetAll
    @Override
    public Set<Student> getAll() {
        return studentDB;
    }
}
