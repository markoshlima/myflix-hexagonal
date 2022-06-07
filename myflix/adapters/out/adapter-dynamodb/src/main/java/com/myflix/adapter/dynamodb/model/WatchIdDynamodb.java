package com.myflix.adapter.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

public class WatchIdDynamodb {

	private String idCustomer;

	private String idMovie;

	@DynamoDBHashKey(attributeName = "id_customer")
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	@DynamoDBRangeKey(attributeName = "id_movie")
	public String getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(String idMovie) {
		this.idMovie = idMovie;
	}
}