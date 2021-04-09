package org.academiadecodigo.asynctomatics.hackathonproject.persistence.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "traveller")
public class Traveller extends AbstractModel {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
//    private List<Integer> tripId = new ArrayList<>();
    
    /**
     * Gets the first name of the customer
     *
     * @return the customer last name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the customer
     *
     * @param firstName the name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the customer
     *
     * @return the customer last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the customer
     *
     * @param lastName the name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the email of the customer
     *
     * @return the customer email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the customer
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the phone of the customer
     *
     * @return the customer phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone of the customer
     *
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //    public List<Integer> getTrips() {
//        return tripId;
//    }
//
//    public void addTrip(Integer trip) {
//        this.tripId.add(trip);
////        trip.setTraveller(this);
//    }
//
//    public void removeTrip(Integer trip) {
//        this.tripId.remove(trip);
////        trip.setTraveller(null);
//    }


}



