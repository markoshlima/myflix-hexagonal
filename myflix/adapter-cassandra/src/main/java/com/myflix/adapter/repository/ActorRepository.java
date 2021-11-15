package com.myflix.adapter.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import com.myflix.adapter.database.CassandraDriver;
import com.myflix.domain.model.Actor;
import com.myflix.domain.port.out.ActorPortOut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("actorCassandra")
public class ActorRepository implements ActorPortOut {
	
	@Autowired
	private CassandraDriver driver;
	
	@Value("${actor.getall}")
	private String actorGetAll;
	
	@Value("${actor.insert}")
	private String actorInsert;
	
	@Value("${actor.delete}")
	private String actorDelete;
	
	@Value("${actor.get}")
	private String actorGet;
	
	@Override
	public Actor save(Actor actor) {
		actor.setIdActor(UUID.randomUUID());
		driver.getSession().execute(actorInsert, actor.getIdActor(), actor.getName(), actor.getBirthDate());
		return actor;
	}

	@Override
	public void delete(UUID actorId) {
		driver.getSession().execute(actorDelete, actorId);		
	}

	@Override
	public List<Actor> getAll() {
		List<Actor> actors = new ArrayList<Actor>();
        ResultSet rs = driver.getSession().execute(actorGetAll);
        for(Row row : rs) {
        	Actor actor = new Actor();
        	actor.setIdActor(row.getUuid("id_actor"));
            actor.setName(row.getString("name"));
            actor.setBirthDate(row.getLong("birth_date"));
            actors.add(actor);
        }
		return actors;
		
	}

	@Override
	public Actor getById(UUID actorId) {
		Actor actor = new Actor();
        ResultSet rs = driver.getSession().execute(actorGet, actorId);
        Row row = rs.one();
        if(row != null) {
        	actor.setIdActor(row.getUuid("id_actor"));
            actor.setName(row.getString("name"));
            actor.setBirthDate(row.getLong("birth_date"));
        }                        
		return actor;
	}
	
}
