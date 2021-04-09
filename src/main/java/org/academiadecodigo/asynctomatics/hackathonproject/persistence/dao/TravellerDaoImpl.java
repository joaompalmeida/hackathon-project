package org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Traveller;
import org.springframework.stereotype.Repository;

@Repository
public class TravellerDaoImpl extends GenericDao<Traveller> implements TravellerDao{

    public TravellerDaoImpl(Class<Traveller> modelType) {
        super(modelType);
    }


    public Traveller get(String email) {
        return entityManager.find(modelType,email);
    }
}
