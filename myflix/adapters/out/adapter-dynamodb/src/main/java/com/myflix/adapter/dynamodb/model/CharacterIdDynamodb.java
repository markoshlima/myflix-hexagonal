package com.myflix.adapter.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

public class CharacterIdDynamodb {

	private String idMovie;

	private String idActor;

	@DynamoDBHashKey(attributeName = "id_movie")
	public String getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(String idMovie) {
		this.idMovie = idMovie;
	}

	@DynamoDBRangeKey(attributeName = "id_actor")
	public String getIdActor() {
		return idActor;
	}
	public void setIdActor(String idActor) {
		this.idActor = idActor;
	}





}