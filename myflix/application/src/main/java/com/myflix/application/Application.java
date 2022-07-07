package com.myflix.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import com.myflix.adapter.grpc.service.ActorService;

@SpringBootApplication(scanBasePackages="com.myflix")
public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(Application.class, args);
        
        System.out.println("Server start");
        Server server = ServerBuilder.forPort(8081)
                .addService(new ActorService())
                .build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            server.shutdown();
        }));
        server.awaitTermination();
        
    }
}