package com.myflix.adapter.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.myflix.domain.model.Watch;
import com.myflix.domain.port.out.WatchPortOut;

@Repository("watchList")
public class WatchRepository implements WatchPortOut {
	
	private List<Watch> watched = new ArrayList<Watch>();

	@Override
	public List<Watch> getByCustomer(UUID customerId) {
		List<Watch> ws = new ArrayList<Watch>();
		for (Watch w : watched){
			if(w.getIdCustomer().equals(customerId)){
				ws.add(w);
			}
		}
		return ws;
	}

	@Override
	public List<Watch> getByMovie(UUID movieId) {
		List<Watch> ws = new ArrayList<Watch>();
		for (Watch w : watched){
			if(w.getIdMovie().equals(movieId)){
				ws.add(w);
			}
		}
		return ws;
	}

	@Override
	public void insert(UUID customerId, UUID movieId) {
		Watch w = new Watch();
		w.setIdCustomer(customerId);
		w.setIdMovie(movieId);
		w.setDate(new Date().getTime());
		watched.add(w);		
	}
	
}
