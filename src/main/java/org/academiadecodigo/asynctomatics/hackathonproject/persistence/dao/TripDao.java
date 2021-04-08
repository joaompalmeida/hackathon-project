package org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao;

import com.sun.tools.javac.file.Locations;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;

import java.util.List;

public interface TripDao {

    public List<Trip> getTripList(String locationGoal, String locationType, String budget);

}
