package org.academiadecodigo.asynctomatics.hackathonproject.services;

import org.academiadecodigo.asynctomatics.hackathonproject.controller.TripChoices;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;

public interface TripService {

    void createTripList(TripChoices tripChoices);

    Trip getTrip();

    void saveTrip(Trip trip);


}
