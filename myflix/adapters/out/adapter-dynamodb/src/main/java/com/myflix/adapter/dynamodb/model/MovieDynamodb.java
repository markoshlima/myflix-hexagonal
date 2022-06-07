package com.myflix.adapter.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

@DynamoDBTable(tableName = "movie")
public class MovieDynamodb {

	@DynamoDBHashKey(attributeName = "id_movie")
	private String idMovie;

	@DynamoDBAttribute(attributeName = "name")
    private String name;

	@DynamoDBAttribute(attributeName = "year")
    private Integer year;

	@DynamoDBTyped(value = DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
	public String getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(String idMovie) {
		this.idMovie = idMovie;
	}

	@DynamoDBTyped(value = DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@DynamoDBTyped(value = DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

}
