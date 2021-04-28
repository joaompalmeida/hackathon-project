package org.academiadecodigo.asynctomatics.hackathonproject.services;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Traveller;

public interface TravellerService {

    void save(Traveller traveller);

    Traveller getTravellerByEmail(String email);

    Traveller getTravellerById(int id);

}
