package com.myflix.domain.port.out;

import com.myflix.domain.model.Watch;

import java.util.List;
import java.util.UUID;

public interface WatchPortOut {

	void insert(UUID customerId, UUID movieId);
    
    List<Watch> getByCustomer(UUID idCustomer);

    List<Watch> getByMovie(UUID idMovie);
    
}
