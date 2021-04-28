package org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Traveller;

public interface TravellerDao {

    Traveller get(int id);
    Traveller getByEmail(String email);

}
