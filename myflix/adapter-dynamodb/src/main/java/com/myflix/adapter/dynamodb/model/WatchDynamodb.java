package com.myflix.adapter.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import org.springframework.data.annotation.Id;

@DynamoDBTable(tableName = "watch")
public class WatchDynamodb {

    @Id
    private WatchIdDynamodb watchId;

	@DynamoDBAttribute(attributeName = "date")
    private String date;

	@DynamoDBHashKey(attributeName = "id_customer")
	public String getIdCustomer() {
		return this.watchId.getIdCustomer();
	}

	public void setIdCustomer(String idCustomer) {
		if(watchId == null){
			watchId = new WatchIdDynamodb();
		}
		watchId.setIdCustomer(idCustomer);
	}

	@DynamoDBRangeKey(attributeName = "id_movie")
	public String getIdMovie() {
		return this.watchId.getIdMovie();
	}

	public void setIdMovie(String idMovie) {
		if(watchId == null){
			watchId = new WatchIdDynamodb();
		}
		watchId.setIdMovie(idMovie);
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
    
}