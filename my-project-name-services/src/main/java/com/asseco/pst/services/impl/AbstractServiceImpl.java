package com.asseco.pst.services.impl;

import com.asseco.pst.entity.PersistentObject;
import com.asseco.pst.repository.AbstractDao;
import com.asseco.pst.services.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbstractServiceImpl<T extends PersistentObject<?>, ID> implements AbstractService<T, ID> {

    private AbstractDao<T, ID> dao;

    @Override
    public void persist(T entity) {
        this.dao.save(entity);
        this.dao.flush();
    }

    @Override
    public void update(T entity) {
        this.dao.save(entity);
    }

    @Override
    public void delete(T entity) {
        this.dao.delete(entity);
        this.dao.flush();
    }

    @Override
    public Optional<T> find(ID id) {
        return this.dao.findById(id);
    }

    @Override
    public List<T> findAll() {
        return this.dao.findAll();
    }

    public AbstractDao<T, ID> getDaoImpl() {
        return dao;
    }

    void setDaoImpl(AbstractDao<T, ID> dao) {
        this.dao = dao;
    }
}
