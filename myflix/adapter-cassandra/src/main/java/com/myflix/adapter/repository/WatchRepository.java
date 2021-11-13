package com.myflix.adapter.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import com.myflix.adapter.config.CassandraConfig;
import com.myflix.domain.model.Watch;
import com.myflix.domain.port.out.WatchPortOut;

@Repository("watchCassandra")
public class WatchRepository implements WatchPortOut {
	
	@Value("${watch.insert}")
	private String watchInsert;
	
	@Value("${watch.getByMovie}")
	private String getByMovie;
	
	@Value("${watch.getByCustomer}")
	private String getByCustomer;
	
	@Override
	public void insert(UUID customerId, UUID movieId) {
		new CassandraConfig().getSession().execute(watchInsert, customerId, movieId, new Date().getTime());
	}

	@Override
	public List<Watch> getByCustomer(UUID idCustomer) {
		
		List<Watch> watchs = new ArrayList<Watch>();
        ResultSet rs = new CassandraConfig().getSession().execute(getByCustomer, idCustomer);
        for(Row row : rs) {
        	Watch watch = new Watch();
        	watch.setIdCustomer(row.getUuid("id_customer"));
        	watch.setIdMovie(row.getUuid("id_movie"));
        	watch.setDate(row.getLong("date"));
        	watchs.add(watch);
        }
		return watchs;
		
	}

	@Override
	public List<Watch> getByMovie(UUID idMovie) {
		
		List<Watch> watchs = new ArrayList<Watch>();
        ResultSet rs = new CassandraConfig().getSession().execute(getByMovie, idMovie);
        for(Row row : rs) {
        	Watch watch = new Watch();
        	watch.setIdCustomer(row.getUuid("id_customer"));
        	watch.setIdMovie(row.getUuid("id_movie"));
        	watch.setDate(row.getLong("date"));
        	watchs.add(watch);
        }
		return watchs;
		
	}
	
	
}
