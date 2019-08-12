package com.asseco.pst.services;

import java.util.List;
import java.util.Optional;

public interface AbstractService<T, ID> {

    void persist(T entity);

    void update(T entity);

    void delete(T entity);

    Optional<T> find(ID id);

    List<T> findAll();

}
