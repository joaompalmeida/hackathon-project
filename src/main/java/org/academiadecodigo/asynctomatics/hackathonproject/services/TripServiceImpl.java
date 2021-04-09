package org.academiadecodigo.asynctomatics.hackathonproject.services;

import org.academiadecodigo.asynctomatics.hackathonproject.controller.TripChoices;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao.*;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@Service
public class TripServiceImpl implements TripService {

    // PROPERTIES ----------

    private TripDaoImpl tripDaoImpl;
    private List<Trip> tripList;
    private TravellerDaoImpl userDao;
    private int tripCount = 0;

    // METHODS ----------

    @Override
    public void createTripList(TripChoices tripChoices) {
        tripList = new LinkedList<>();

        tripList = tripDaoImpl.getTripList(tripChoices.getLocationGoal(),
                tripChoices.getLocationType(), tripChoices.getBudget());

        System.out.println(tripList.size() + " ololgcfhjghjo " + tripList.get(0));

        while(tripList.size() > 3) {

            tripList.remove((int) Math.floor(Math.random() * tripList.size()));

        }
        System.out.println(tripList.size() + " ololo " + tripList.get(0));
    }

    @Override
    public Trip getTrip() {

        if (tripCount <= 3) {

            return tripList.get(tripCount++);

        }

        tripCount = 0;
        return tripList.get(tripCount);


    }

    @Transactional
    @Override
    public void saveTrip(Trip trip) {

        tripDaoImpl.save(trip);

    }


    // GETTERS ----------
    public TravellerDaoImpl getUserDao() {
        return userDao;
    }

    public TripDaoImpl getTripDao() {
        return tripDaoImpl;
    }


    // SETTERS ----------


    @Autowired
    public void setTripDaoImpl(TripDaoImpl tripDaoImpl) {
        this.tripDaoImpl = tripDaoImpl;
    }

    @Override
    public String toString() {
        return "TripServiceImpl{" +
                "userDao=" + userDao +
                ", tripDao=" + tripDaoImpl +
                '}';
    }
}
