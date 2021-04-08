package org.academiadecodigo.asynctomatics.hackathonproject.services;

import org.academiadecodigo.asynctomatics.hackathonproject.controller.TripChoices;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao.*;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TripServiceImpl implements TripService {

    // PROPERTIES ----------

    private TripDaoImpl tripDaoImpl;
    private List<Trip> tripList;
    private TravellerDaoImpl userDao;
    private int tripCount = 0;

    // METHODS ----------

    @Override
    public void createTripList(TripChoices tripChoices) {

        tripList = tripDaoImpl.getTripList(tripChoices.getLocationGoal(),
                tripChoices.getLocationType(), tripChoices.getBudget());

        while(tripList.size() > 3) {

                tripList.remove(Math.floor(Math.random() * tripList.size()));

        }
    }

    @Override
    public Trip getTrip() {

        if (tripCount <= 2) {

            return tripList.get(tripCount++);

        }

        tripCount = 0;
        return tripList.get(tripCount);


    }

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
