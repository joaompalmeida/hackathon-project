package org.academiadecodigo.asynctomatics.hackathonproject.persistence.model;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.location.Location;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trip")
public class Trip extends AbstractModel {

	private Date startDate;
	private Date endDate;
	@ManyToOne
	private Traveller traveller;
	@OneToOne
	private Location location;

	public void setTraveller(Traveller traveller){
		this.traveller = traveller;
	}

}
