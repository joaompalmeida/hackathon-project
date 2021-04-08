package org.academiadecodigo.asynctomatics.hackathonproject.persistence.model;

import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.location.Location;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel extends AbstractModel {

	private String name;
	private int price;
	@ManyToOne
	private Location location;

}
