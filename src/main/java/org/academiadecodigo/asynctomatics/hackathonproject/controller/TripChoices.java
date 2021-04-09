package org.academiadecodigo.asynctomatics.hackathonproject.controller;

import org.springframework.stereotype.Component;

@Component
public class TripChoices {

    private String locationType;
    private String locationGoal;
    private String budget;

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getLocationGoal() {
        return locationGoal;
    }

    public void setLocationGoal(String locationGoal) {
        this.locationGoal = locationGoal;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "TripChoices{" +
                "locationType='" + locationType + '\'' +
                ", locationGoal='" + locationGoal + '\'' +
                ", budget='" + budget + '\'' +
                '}';
    }
}
