/* SubjectRepository.java
Repository package for SubjectRepository
Author: Jayden Johnson (219086796)
Date: 2 April 2022
*/

package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Subject;

import java.util.Set;

public class SubjectRepository implements ISubjectRepository{
    private static SubjectRepository repository = null;
    private Set<Subject> subjectDB = null;

    private static SubjectRepository getRepository(){
        if(repository == null){
           repository = new SubjectRepository();
        }
        return repository;
    }

    @Override
    public Subject create(Subject subject) {
        boolean success = subjectDB.add(subject);
        if(!success)
            return null;
        return subject;
    }

    @Override
    public Subject read(String subjectID) {
        Subject subject = subjectDB.stream()
                .filter(e -> e.getSubjectID().equals(subjectID))
                .findAny()
                .orElse(null);
        return subject;
    }

    @Override
    public Subject update(Subject subject) {
        Subject oldSubject = read(subject.getSubjectID());
        if(oldSubject != null){
           subjectDB.remove(oldSubject);
           subjectDB.add(subject);
           return subject;
        }
        return null;
    }

    @Override
    public boolean delete(String subjectID) {
        Subject subjectToDelete = read(subjectID);
        if (subjectToDelete == null)
            return false;
        subjectDB.remove(subjectToDelete);
        return true;
    }

    @Override
    public Set<Subject> getAll() {
        return subjectDB;
    }
}
