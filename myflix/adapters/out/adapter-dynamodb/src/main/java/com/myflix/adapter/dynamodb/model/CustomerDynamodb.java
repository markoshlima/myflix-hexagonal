package com.myflix.adapter.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

@DynamoDBTable(tableName = "customer")
public class CustomerDynamodb {

	@DynamoDBHashKey(attributeName = "id_customer")
	private String idCustomer;

	@DynamoDBAttribute(attributeName = "name")
    private String name;

	@DynamoDBAttribute(attributeName = "birth_date")
    private String birthDate;

	@DynamoDBTyped(value = DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
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
