package za.ac.cput.services;

import java.util.Optional;

public interface IService <T, ID> {
    T save(T t);
    Optional<T> read (String id);
    void delete (T t);
}
