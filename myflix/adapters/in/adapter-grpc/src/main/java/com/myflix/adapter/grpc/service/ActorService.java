package com.myflix.adapter.grpc.service;

import java.util.List;

import com.myflix.adapter.grpc.protofiles.actor.getAllRequest;
import com.myflix.adapter.grpc.protofiles.actor.getAllResponse;
import com.myflix.adapter.grpc.protofiles.actor.saveRequest;
import com.myflix.adapter.grpc.protofiles.actor.saveResponse;
import com.myflix.adapter.grpc.protofiles.actor.ActorServiceGrpc.ActorServiceImplBase;

import com.myflix.domain.model.Actor;
import com.myflix.domain.port.in.ActorPortIn;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService extends ActorServiceImplBase {

    @Autowired
	private ActorPortIn actorService;

    public void save(saveRequest request, StreamObserver<saveResponse> responseObserver) {

        Actor actor = new Actor();
        actor.setBirthDate(request.getBirthDate());
        actor.setName(request.getName());

        Actor res = actorService.save(actor);

        com.myflix.adapter.grpc.protofiles.actor.Actor a = this.domainActorToProtoActor(res);

        saveResponse response = saveResponse.newBuilder()
                .setActor(a)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        
    }
    
    public void getAll(getAllRequest request, StreamObserver<getAllResponse> responseObserver) {

        List<Actor> actors = actorService.getAll();
        actors.forEach(actor -> responseObserver.onNext(getAllResponse.newBuilder().setActor(this.domainActorToProtoActor(actor)).build()));
        responseObserver.onCompleted();
        
    }

    public com.myflix.adapter.grpc.protofiles.actor.Actor domainActorToProtoActor(Actor a){
        com.myflix.adapter.grpc.protofiles.actor.Actor actor = com.myflix.adapter.grpc.protofiles.actor.Actor.newBuilder()
                .setIdActor(a.getIdActor().toString())
                .setName(a.getName())
                .setBirthDate(a.getBirthDate())
                .build();
        return actor;
    }

}