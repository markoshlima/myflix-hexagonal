package com.myflix.adapter.database;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.config.DriverConfigLoader;

@Component
@Scope("singleton")
public class CassandraDriver {

	private static final String DRIVER = "cassandra.conf";
	
	private CqlSession session;
	
	public CassandraDriver() {
		this.startSession();
	}
	
	public void startSession() {
		DriverConfigLoader loader = DriverConfigLoader.fromClasspath(DRIVER);
		this.session = CqlSession.builder().withConfigLoader(loader).build();
	}
	
	public CqlSession getSession() {
		return this.session;
	}	
	
}
