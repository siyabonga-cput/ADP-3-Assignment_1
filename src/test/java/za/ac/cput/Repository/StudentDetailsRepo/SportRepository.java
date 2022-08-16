package za.ac.cput.Repository.StudentDetailsRepo;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import za.ac.cput.domain.StudentDetails.Sport;
import za.ac.cput.repository.Interface.StudentDetailsInterface.ISportRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

//Siyabonga Tumelo Masango
//219200815
//31/03/2022
//sportFactory.java

public class SportRepository implements ISportRepository {

    private static SportRepository repository = null;
    private Set<Sport> sportDB = null;

    private SportRepository() {
        sportDB = new HashSet<Sport>();
    }

    public static SportRepository getRepository() {

        if (repository == null) {
            repository = new SportRepository();
        }
        return repository;
    }
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

    @Override
    public List<Sport> findAll() {
        return null;
    }

    @Override
    public List<Sport> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Sport> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Sport> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Sport entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Sport> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Sport> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Sport> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Sport> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Sport> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Sport> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Sport> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Sport getOne(String s) {
        return null;
    }

    @Override
    public Sport getById(String s) {
        return null;
    }

    @Override
    public <S extends Sport> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Sport> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Sport> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Sport> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Sport> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Sport> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Sport, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}

