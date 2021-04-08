package org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;

import javax.persistence.EntityManager;

public interface Dao<T> {

    T save(T modelObject);
}
