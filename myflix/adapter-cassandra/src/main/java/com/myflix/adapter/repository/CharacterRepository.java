package com.myflix.adapter.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import com.myflix.adapter.database.CassandraDriver;
import com.myflix.domain.model.Character;
import com.myflix.domain.port.out.CharacterPortOut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("characterCassandra")
public class CharacterRepository implements CharacterPortOut {
	
	@Autowired
	private CassandraDriver driver;
	
	@Value("${character.insert}")
	private String characterInsert;
	
	@Value("${character.getByMovie}")
	private String characterGetByMovie;
	
	@Value("${character.getByActor}")
	private String characterGetByActor;
	
	@Override
	public void save(UUID actorId, UUID movieId, String name) {
		driver.getSession().execute(characterInsert, movieId, actorId, name);
	}

	@Override
	public List<Character> getByActor(UUID actorId) {
		List<Character> characters = new ArrayList<Character>();
        ResultSet rs = driver.getSession().execute(characterGetByActor, actorId);
        for(Row row : rs) {
        	Character character = new Character();
        	character.setIdActor(row.getUuid("id_actor"));
        	character.setIdMovie(row.getUuid("id_movie"));
        	character.setName(row.getString("name"));
        	characters.add(character);
        }
		return characters;
	}

	@Override
	public List<Character> getByMovie(UUID movieId) {
		List<Character> characters = new ArrayList<Character>();
        ResultSet rs = driver.getSession().execute(characterGetByMovie, movieId);
        for(Row row : rs) {
        	Character character = new Character();
        	character.setIdActor(row.getUuid("id_actor"));
        	character.setIdMovie(row.getUuid("id_movie"));
        	character.setName(row.getString("name"));
        	characters.add(character);
        }
		return characters;
	}
	
}
