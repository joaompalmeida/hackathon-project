package org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Repository
public class TripDaoImpl extends GenericDao<Trip> implements TripDao{

    public TripDaoImpl() {
        super(Trip.class);
    }

    @Override
    public List<Trip> getTripList(String locationGoal, String locationType, String budget) {

        CriteriaQuery<Trip> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(modelType);
        Root<Trip> root = criteriaQuery.from(modelType);
        List<Trip> list = entityManager.createQuery(criteriaQuery).getResultList();

        switch(budget) {

            case "low":
            return list.stream().filter(p ->
                    p.getLocationGoal().equals(locationGoal.toUpperCase()) && p.getLocationType().equals(locationType.toUpperCase())
                            && Integer.parseInt(p.getPrice()) <= 200)
                    .collect(Collectors.toList());
            case "medium":
                return list.stream().filter(p ->
                        p.getLocationGoal().equals(locationGoal.toUpperCase()) && p.getLocationType().equals(locationType.toUpperCase())
                                && Integer.parseInt(p.getPrice()) > 200 && Integer.parseInt(p.getPrice()) < 400)
                        .collect(Collectors.toList());
            default:
                return list.stream().filter(p ->
                        p.getLocationGoal().equals(locationGoal.toUpperCase()) && p.getLocationType().equals(locationType.toUpperCase())
                                && Integer.parseInt(p.getPrice()) >= 400)
                        .collect(Collectors.toList());

        }

    }

}