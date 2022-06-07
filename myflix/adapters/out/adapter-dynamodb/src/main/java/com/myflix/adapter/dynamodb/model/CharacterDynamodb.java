package com.myflix.adapter.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import org.springframework.data.annotation.Id;

@DynamoDBTable(tableName = "character")
public class CharacterDynamodb {

	@Id
	private CharacterIdDynamodb characterId;

	@DynamoDBAttribute(attributeName = "name")
	private String name;

	@DynamoDBHashKey(attributeName = "id_movie")
	public String getIdMovie() {
		return this.characterId.getIdMovie();
	}

	public void setIdMovie(String idMovie) {
		if(characterId == null){
			characterId = new CharacterIdDynamodb();
		}
		characterId.setIdMovie(idMovie);
	}

	@DynamoDBRangeKey(attributeName = "id_actor")
	public String getIdActor() {
		return this.characterId.getIdActor();
	}

	public void setIdActor(String idActor) {
		if(characterId == null){
			characterId = new CharacterIdDynamodb();
		}
		characterId.setIdActor(idActor);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
        
}
