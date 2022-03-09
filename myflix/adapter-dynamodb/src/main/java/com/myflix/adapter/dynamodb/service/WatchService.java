package com.myflix.adapter.dynamodb.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.myflix.adapter.dynamodb.config.DynamoDBDriver;
import com.myflix.adapter.dynamodb.model.WatchDynamodb;
import com.myflix.adapter.dynamodb.model.mapper.WatchMapper;
import com.myflix.adapter.dynamodb.repository.WatchRepository;
import com.myflix.domain.model.Watch;
import com.myflix.domain.port.out.WatchPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("watchDynamodb")
public class WatchService implements WatchPortOut{

    @Autowired
    WatchRepository repository;

    DynamoDBMapper mapper;

    public WatchService(){
        mapper = new DynamoDBMapper(new DynamoDBDriver().amazonDynamoDB());
    }

    @Override
    public void insert(UUID customerId, UUID movieId) {
        WatchDynamodb w = new WatchDynamodb();
        w.setIdCustomer(customerId.toString());
        w.setIdMovie(movieId.toString());
        w.setDate(String.valueOf(new Date().getTime()));
        mapper.save(w);
    }

    @Override
    public List<Watch> getByCustomer(UUID idCustomer) {
        ArrayList<WatchDynamodb> list = repository.findAll();
        ArrayList<Watch> watches = new ArrayList<>();
        if(list.size() > 0){
            for (WatchDynamodb w : list) {
                if(w.getIdCustomer().equals(idCustomer.toString())) {
                    watches.add(WatchMapper.mapperToWatch(w));
                }
            }
        }
        return watches;
    }

    @Override
    public List<Watch> getByMovie(UUID idMovie) {
        ArrayList<WatchDynamodb> list = repository.findAll();
        ArrayList<Watch> watches = new ArrayList<>();
        if(list.size() > 0){
            for (WatchDynamodb w : list) {
                if(w.getIdMovie().equals(idMovie.toString())) {
                    watches.add(WatchMapper.mapperToWatch(w));
                }
            }
        }
        return watches;
    }
}
