package za.ac.cput.repository.AdminRepo;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.repository.Interface.AdminInterface.IAdminRepository;


import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class AdminRepository implements IAdminRepository {

private  static AdminRepository repository = null;
private Set<Admin> adminDB = null;

private AdminRepository(){adminDB = new HashSet<Admin>();}

public static AdminRepository getRepository(){

    if(repository == null){
        repository = new AdminRepository();
    }
return repository;
}
//    @Override
//    public Admin create(Admin admin) {
//    boolean success = adminDB.add(admin);
//    if (!success)
//        return null;
//    return admin;
//    }
//
//    @Override
//    public Admin read(String adminID) {
//    Admin admin = adminDB.stream().filter(e-> e.getAdminID().equals(adminID)).findAny().orElse(null);
//     return admin;
//    }
//
//    @Override
//    public Admin update(Admin admin) {
//    Admin admin1 = read(admin.getAdminID());
//    if (admin1 != null){
//        adminDB.remove(admin1);
//        adminDB.add(admin);
//        return null;
//    }
//    return admin;
//    }
//
//    @Override
//    public boolean delete(String adminID) {
//     Admin adminDelete = read(adminID);
//     if (adminDelete == null){
//         System.out.println("Admin is null");
//
//     }
//     adminDB.remove(adminDelete);
//        System.out.println("Admin removed");
//        return true;
//    }
//
//
//    @Override
//    public Set<Admin> getAll() {
//        return adminDB ;
//    }

    @Override
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public List<Admin> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Admin> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Admin> findAllById(Iterable<String> strings) {
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
    public void delete(Admin entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Admin> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Admin> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Admin> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Admin> findById(String s) {
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
    public <S extends Admin> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Admin> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Admin> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Admin getOne(String s) {
        return null;
    }

    @Override
    public Admin getById(String s) {
        return null;
    }

    @Override
    public <S extends Admin> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Admin> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Admin> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Admin> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Admin> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Admin> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Admin, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
