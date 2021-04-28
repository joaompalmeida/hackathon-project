package org.academiadecodigo.asynctomatics.hackathonproject.persistence.dao;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Traveller;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository
public class TravellerDaoImpl extends GenericDao<Traveller> implements TravellerDao{

    public TravellerDaoImpl() {
        super(Traveller.class);
    }


    public Traveller get(int id) {
        return entityManager.find(modelType,id);
    }

    public Traveller getByEmail(String email) {

        try {
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Traveller> criteriaQuery = builder.createQuery(modelType);
            Root<Traveller> root = criteriaQuery.from(modelType);
            criteriaQuery.select(root);
            criteriaQuery.where(builder.equal(root.get("email"), email));

            return entityManager.createQuery(criteriaQuery).getSingleResult();
        } catch (Exception e) {
            System.out.println("\nno email...\n");
            return null;
        } finally {
            System.out.println("\nClient fetched.\n");
        }
    }
}
