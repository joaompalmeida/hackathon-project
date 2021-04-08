package org.academiadecodigo.asynctomatics.hackathonproject.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "traveller")
public class Traveller extends AbstractModel {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            mappedBy = "traveller",
            fetch = FetchType.EAGER
    )
    private List<Trip> trip = new ArrayList<>();

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

    public List<Trip> getTrips() {
        return trip;
    }

    public void addTrip(Trip trip) {
        this.trip.add(trip);
        trip.setTraveller(this);
    }

    public void removeTrip(Trip trip) {
        this.trip.remove(trip);
        trip.setTraveller(null);
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {

        // printing recipients with lazy loading
        // and no session will cause issues
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", accounts=" + trip +
                "} " + super.toString();
    }
}



