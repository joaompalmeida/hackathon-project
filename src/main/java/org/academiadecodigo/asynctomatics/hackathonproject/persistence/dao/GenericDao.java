package org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao;

import com.mysql.cj.Session;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Model;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;

public abstract class GenericDao<T extends Model> implements Dao<T> {

    // PROPERTIES ---------

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager entityManager;

    // CONSTRUCTOR METHOD ---------

    public GenericDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    // SETTERS ---------

    public void setModelType(Class<T> modelType) {
        this.modelType = modelType;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public T save(T modelObject) {

        return entityManager.merge(modelObject);

    }
}
