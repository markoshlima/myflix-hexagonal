package com.myflix.adapter.dynamodb.model.mapper;

import com.myflix.adapter.dynamodb.model.WatchDynamodb;
import com.myflix.domain.model.Watch;

import java.util.UUID;

public class WatchMapper {

    public static Watch mapperToWatch(WatchDynamodb w){
        Watch watch = new Watch();
        watch.setIdCustomer(UUID.fromString(w.getIdCustomer()));
        watch.setIdMovie(UUID.fromString(w.getIdMovie()));
        watch.setDate(Long.parseLong(w.getDate()));
        return watch;
    }

}
