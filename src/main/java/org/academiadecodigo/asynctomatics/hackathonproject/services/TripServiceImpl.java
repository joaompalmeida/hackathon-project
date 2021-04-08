package org.academiadecodigo.asynctomatics.hackathonproject.services;

import org.academiadecodigo.asynctomatics.hackathonproject.controller.TripChoices;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao.*;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.location.Location;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TripServiceImpl implements TripService {

    // PROPERTIES ----------

    private UserDaoImpl userDaoImpl;
    private TripDaoImpl tripDaoImpl;
    private List<Trip> tripList;

    // CONSTRUCTOR METHOD ----------




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
        return null;
    }



    // GETTERS ----------
    public UserDaoImpl getUserDao() {
        return userDaoImpl;
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
                "userDao=" + userDaoImpl +
                ", tripDao=" + tripDaoImpl +
                '}';
    }
}
