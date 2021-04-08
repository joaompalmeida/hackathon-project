package org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.location;

import java.util.Arrays;
import java.util.List;

public enum LocationType {

	BEACH,
	MOUNTAIN,
	URBAN,
	COUNTRYSIDE;

	public static List<LocationType> list() {
		return Arrays.asList(LocationType.values());
	}

}
