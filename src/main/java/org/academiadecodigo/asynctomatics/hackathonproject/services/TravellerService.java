package org.academiadecodigo.asynctomatics.hackathonproject.services;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Traveller;

public interface TravellerService {

    Traveller getTraveller(String Email);

    void save(Traveller traveller);

}
