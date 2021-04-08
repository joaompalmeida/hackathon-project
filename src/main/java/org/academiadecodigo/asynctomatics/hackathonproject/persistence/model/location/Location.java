package org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.location;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.AbstractModel;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Hotel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "location")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Location extends AbstractModel {


	private String name;
	private LocationGoal locationGoal;
	private LocationType locationType;
	@OneToMany(
			// propagate changes on customer entity to account entities
			cascade = {CascadeType.ALL},
			// make sure to remove accounts if unlinked from customer
			orphanRemoval = true,
			// user customer foreign key on account table to establish
			// the many-to-one relationship instead of a join table
			mappedBy = "location",
			// fetch accounts from database together with user
			fetch = FetchType.EAGER
	)
	private List<Hotel> hotels = new ArrayList<>();




	public LocationGoal getLocationGoal() {
		return locationGoal;
	}

	public void setLocationGoal(LocationGoal locationGoal) {
		this.locationGoal = locationGoal;
	}

	public LocationType getLocationType() {
		return locationType;
	}

	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}
}
