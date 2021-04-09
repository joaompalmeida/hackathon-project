package org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;

import java.util.List;

public interface TripDao extends Dao<Trip>{

    List<Trip> getTripList(String locationGoal, String locationType, String budget);

}
