package org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.location;

import java.util.Arrays;
import java.util.List;

public enum LocationGoal {

	ACTION,
	CULTURE,
	RELAXATION;

	public static List<LocationGoal> list() {
		return Arrays.asList(LocationGoal.values());
	}

}
