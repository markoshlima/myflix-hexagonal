package com.myflix.adapter.config;

import org.springframework.context.annotation.Configuration;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.config.DriverConfigLoader;

@Configuration
public class CassandraConfig {

	private static final String DRIVER = "cassandra.conf";
	
	private CqlSession session;
	
	public CassandraConfig() {
		this.getSession();
	}
	
	public CqlSession getSession() {
		DriverConfigLoader loader = DriverConfigLoader.fromClasspath(DRIVER);
		if(session == null) {
			session = CqlSession.builder().withConfigLoader(loader).build();
		}
		return session;
	}
	
}
