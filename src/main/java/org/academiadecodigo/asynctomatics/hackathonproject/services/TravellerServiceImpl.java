package org.academiadecodigo.asynctomatics.hackathonproject.services;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao.TravellerDaoImpl;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Traveller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TravellerServiceImpl implements TravellerService{


    private TravellerDaoImpl travellerDao;

    @Autowired
    public void setTravellerDao(TravellerDaoImpl travellerDao) {
        this.travellerDao = travellerDao;
    }

    @Transactional
    @Override
    public void save(Traveller traveller) {
        travellerDao.save(traveller);
    }

    @Transactional
    @Override
    public Traveller getTravellerByEmail(String email) {
        return travellerDao.getByEmail(email);
    }

    @Transactional
    @Override
    public Traveller getTravellerById(int id) {
        return travellerDao.get(id);
    }

}