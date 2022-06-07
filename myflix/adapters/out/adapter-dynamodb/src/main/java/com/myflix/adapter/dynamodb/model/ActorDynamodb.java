package com.myflix.adapter.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

@DynamoDBTable(tableName = "actor")
public class ActorDynamodb {

	@DynamoDBHashKey(attributeName = "id_actor")
	private String idActor;

	@DynamoDBAttribute(attributeName = "name")
    private String name;

	@DynamoDBAttribute(attributeName = "birth_date")
    private String birthDate;

	@DynamoDBTyped(value = DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
	public String getIdActor() {
		return idActor;
	}
	public void setIdActor(String idActor) {
		this.idActor = idActor;
	}

	@DynamoDBTyped(value = DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@DynamoDBTyped(value = DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

}
